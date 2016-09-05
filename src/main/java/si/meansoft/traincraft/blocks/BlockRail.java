package si.meansoft.traincraft.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.client.models.ModelExtendedBase;
import si.meansoft.traincraft.client.models.ModelTrackShortStraight;
import si.meansoft.traincraft.network.ClientProxy;
import si.meansoft.traincraft.network.CommonProxy;
import si.meansoft.traincraft.tile.TileEntityRail;

/**
 * @author canitzp
 */
public class BlockRail extends BlockBase implements ITileEntityProvider{

    public TrackLength length;
    public TrackDirection direction;
    public String nameExtra;

    public BlockRail(String extraName, TrackLength length, TrackDirection direction) {
        super(Material.IRON, "track" + Util.firstCharToUpperCase(length.name) + Util.firstCharToUpperCase(direction.name) + extraName);
        this.length = length;
        this.direction = direction;
        this.nameExtra = extraName;
        this.isBlockContainer = true;
    }

    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        if(!world.isRemote){
            TrackPlacing.placeTrack(world, (EntityPlayer) placer, pos, getDefaultState(), hitX, hitY, hitZ, this.length, this.direction);
        }
        return null;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state){
        TrackPlacing.harvestTrack(worldIn, pos, state, (TileEntityRail) worldIn.getTileEntity(pos));
        worldIn.removeTileEntity(pos);
        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta){
        return new TileEntityRail("");
    }

    public enum TrackDirection{
        STRAIGHT("straight"),
        CURVE("curve"),
        SPECIAL("");
        public String name;
        TrackDirection(String name){
            this.name = name;
        }
    }
    public enum TrackLength {
        SHORT("short", 1),
        MEDIUM("medium", 3),
        LONG("long", 5);
        public String name;
        public int lenght;
        TrackLength(String name, int length){
            this.name = name;
            this.lenght = length;
        }
    }

}
