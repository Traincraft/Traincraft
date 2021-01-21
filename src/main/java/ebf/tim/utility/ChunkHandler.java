package ebf.tim.utility;

import com.google.common.collect.ListMultimap;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import ebf.tim.entities.GenericRailTransport;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.event.entity.EntityEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Chunk management</h1>
 *
 * this basically covers all necessary chunkloading and unloading work for any entity that needs it.
 * aside from this:
 * the entities have to store the variables for this to use, and get their own keys.
 * the main class needs to register it (it probably doesn't need to be in pre-init but it works there, so...)
 *
 * @author Eternal Blue Flame
 */
public class ChunkHandler implements ForgeChunkManager.LoadingCallback, ForgeChunkManager.OrderedLoadingCallback, ForgeChunkManager.PlayerOrderedLoadingCallback {

    /**
     * <h2>EntityEntering chunk event</h2>
     * called when an entity enters a chunk.
     * we use this to figure out if the entity is one of ours, and then force the chunkloading.
     */
    @SuppressWarnings("unused")
    @SubscribeEvent
    public void entityEnteredChunk(EntityEvent.EnteringChunk event) {
        if(CommonProxy.enableChunkloading && event.entity instanceof GenericRailTransport && !event.entity.worldObj.isRemote) {
            forceChunkLoading(((GenericRailTransport) event.entity), event.newChunkX, event.newChunkZ);
        }
    }

    /**
     * <h2>Force load chunks</h2>
     * collects the chunk positions around the entity and it's sub-entities, and then forces them to load
     * @param transport the entity to update
     * @param newChunkX the x position of the new chunk
     * @param newChunkZ the z position of the new chunk
     */
    private static void forceChunkLoading(GenericRailTransport transport, int newChunkX, int newChunkZ) {
        /*be sure the ticket is valid, otherwise we just crash*/
        if(transport.getChunkTicket() != null) {
            ChunkCoordIntPair pair = null;
            List<ChunkCoordIntPair> newChunks = new ArrayList<ChunkCoordIntPair>();

            /*get the chunks around the new chunk of the main entitiy, this should find 9 chunks (3x3 grid).
            * it would probably be a good idea to be sure the chunk limit per ticket will support at least 9 chunks
            *     if it doesn't, then the settings should change chunkloading to off and stop it before using it*/
            for(int x = newChunkX - 1; x <= newChunkX + 1; ++x) {
                for(int z = newChunkZ - 1; z <= newChunkZ + 1; ++z) {
                    newChunks.add(new ChunkCoordIntPair(x, z));
                }
            }

            /*update chunks around the sub-entities, in this case it's the hitbox entities
            * this should also find 9 chunks, per hitbox. But we only add the ones we don't already know,
            *     and we clamp the list length to the max chunk count for the ticket,
            *     since the user can change that value in forge, and we don't wanna try and bite off more than we can chew*/
            for(int x = transport.chunkCoordX - 1; x <= transport.chunkCoordX + 1; ++x) {
                for(int z = transport.chunkCoordZ - 1; z <= transport.chunkCoordZ + 1; ++z) {
                    pair = new ChunkCoordIntPair(x, z);
                    if (!newChunks.contains(pair) && newChunks.size() < transport.getChunkTicket().getMaxChunkListDepth()) {
                        newChunks.add(pair);
                    }
                }
            }

            /*now we take the list we generated and force the chunks to load.*/
            for(ChunkCoordIntPair chunk : newChunks) {
                ForgeChunkManager.forceChunk(transport.getChunkTicket(), chunk);
                ForgeChunkManager.reorderChunk(transport.getChunkTicket(), chunk);
            }
            /*now we go through the old list and force any chunks that were previously loaded to unload*/
            for (ChunkCoordIntPair oldChunk : transport.chunkLocations){
                if(!newChunks.contains(oldChunk)){
                    ForgeChunkManager.unforceChunk(transport.getChunkTicket(), oldChunk);
                }
            }
            /*and lastly we set the old chunk list to the new one*/
            transport.chunkLocations = newChunks;
        }
    }


    @Override
    public void ticketsLoaded(List<Ticket> tickets, World world) {
        for(Ticket ticket : tickets) {
            if(!ticket.isPlayerTicket() && ticket.getEntity() instanceof GenericRailTransport) {
                GenericRailTransport transport = (GenericRailTransport) ticket.getEntity();
                transport.setChunkTicket(ticket);
                forceChunkLoading(transport, transport.chunkCoordX, transport.chunkCoordZ);
            }
        }
    }

    @Override
    public List<Ticket> ticketsLoaded(List<Ticket> tickets, World world, int maxTicketCount) {
        List<Ticket> transportTickets = new ArrayList<>();
        for(Ticket ticket : tickets){
            if(ticket.getEntity() instanceof GenericRailTransport) {
                transportTickets.add(ticket);
            }
        }
        return transportTickets;
    }

    /*this is for player bound tickets, which we don't use, so pretty much just return to sender.*/
    public ListMultimap<String, Ticket> playerTicketsLoaded(ListMultimap<String, Ticket> tickets, World world) {return tickets;}
}
