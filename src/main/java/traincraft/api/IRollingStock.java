package traincraft.api;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.IMinecartCollisionHandler;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.items.IItemHandler;
import traincraft.renderer.TraincraftModel;
import traincraft.tile.BaseTile;

/**
 * This describes the default values and behaviours any rolling stock should have.
 * It nearly fully implemented through {@link AbstractRollingStock}, which you should extend in favor of this.
 * This interface is only for clearly seeing the documentation and all of this could be moved to {@link AbstractRollingStock}.
 *
 * @see AbstractRollingStock
 * @see LocomotiveSteam
 * @since 5.0.0
 * @author canitzp
 */
public interface IRollingStock {
    
    /**
     * Use this to read from nbt.
     * This is also called when a sync packet arrives (SYNC)
     * or a previously placed rolling stock is played again (DROP).
     *
     * @param rollingStock This rolling stock
     * @param nbt The nbt compound to read from
     * @param state What was written (e.g.: a sync packet has not written all values)
     */
    default void readFromNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){}
    
    /**
     * Use this to write custom NBT to this rolling stock.
     *
     * @param rollingStock This rolling stock
     * @param nbt The nbt compound to write to
     * @param state What should be written (e.g.: a sync packet has not to write all values)
     */
    default void writeToNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){}
    
    /**
     * Gets the size of this, within a {@link Vec3d} object.
     * The x-field is the width, the y-field is the height and the z-field is the depth
     *
     * The default value is a one by one block sized entity.
     *
     * @param rollingStock This rolling stock
     * @return The size of this rolling stock
     */
    default Vec3d getSize(AbstractRollingStock<?> rollingStock){
        return new Vec3d(0.98F, 0.98F, 0.98F);
    }
    
    /**
     * Used to return a List with {@link AxisAlignedBB} as collision boxes.
     * Called every server tick for this rolling stock.
     * Leaving this empty would lead to this rolling stock not having a collision at all.
     * Normally this returns a singleton list with default collision box logic applied.
     *
     * @param rollingStock This rolling stock
     * @param posVec The position of this rolling stock as {@link Vec3d}
     * @return A list with collision boxes
     */
    default List<AxisAlignedBB> getCollisionBoxes(AbstractRollingStock<?> rollingStock, Vec3d posVec){
        IMinecartCollisionHandler collisionHandler = EntityMinecart.getCollisionHandler();
        if(collisionHandler != null){
            return Collections.singletonList(collisionHandler.getMinecartCollisionBox(rollingStock));
        }
        return Collections.singletonList(rollingStock.getEntityBoundingBox().grow(0.2D, 0.0D, 0.2D));
    }
    
    /**
     * Gets the acceleration this rolling stock should be capable of.
     * Unit should be meters/second (m/s)
     *
     * @param rollingStock This rolling stock
     * @return The acceleration
     */
    double getAcceleration(AbstractRollingStock<?> rollingStock);
    
    /**
     * Gets the maximum break power this rolling stock should be capable of.
     * Unit should be meters/second (m/s)
     *
     * @param rollingStock This rolling stock
     * @return The maximum break power
     */
    double getBreakPower(AbstractRollingStock<?> rollingStock);
    
    /**
     * Gets the maximum speed this rolling stock should be capable of.
     * Unit should be meters/second (m/s)
     *
     * @param rollingStock This rolling stock
     * @return The maximum speed
     */
    double getMaxSpeed(AbstractRollingStock<?> rollingStock);
    
    /**
     * Gets the maximum reverse speed this rolling stock should be capable of.
     * Unit should be meters/second (m/s)
     *
     * Set this to zero or below will prevent the rolling stock from driving in reverse direction.
     * This can be set to the maximum speed in case the rolling stock can drive in both directions
     *
     * @param rollingStock This rolling stock
     * @return The maximum reverse speed
     */
    double getMaxReverseSpeed(AbstractRollingStock<?> rollingStock);
    
    /**
     * Gets the mass of the empty rolling stock.
     * This is used in acceleration and breaking calculations.
     * Unit should be kilogram (kg).
     * Every player should add about 80-90kg to this.
     * In Freight cars one block (itemblock) should add around (hardness*1000) kg per one block
     * and all other items 100kg per stack.
     *
     * @param rollingStock This rolling stock
     * @return The mass
     */
    double getMass(AbstractRollingStock<?> rollingStock);
    
    /**
     * With this method you can add skins to your rolling stock.
     * Keep in mind that by not overwriting this method the rolling stock has no texture.
     * The default texture is at index 0.
     *
     * @param rollingStock This rolling stock
     * @param skins The map of skins already registered
     */
    default void registerSkins(AbstractRollingStock<?> rollingStock, Map<String, ResourceLocation> skins){}
    
    /**
     * Use this method to add seats to your rolling stock.
     *
     * @param rollingStock This rolling stock
     * @param seats The list of seats
     */
    default void registerSeats(AbstractRollingStock<?> rollingStock, List<PassengerSeat> seats){}
    
    /**
     * This is used by the renderer to get the actual model that has to be rendered.
     * Since it is called every frame, it should not create new objects, instead it should
     * use a static final Model.
     *
     * @param rollingStock This rolling stock
     * @return The rolling stock model
     */
    TraincraftModel getModel(AbstractRollingStock<?> rollingStock);
    
    /**
     * Used by the {@link traincraft.renderer.RendererRollingStock} to determine the texture for
     * the model.
     * This is called every frame and therefor shouldn't use any object creation.
     *
     * @param rollingStock This rolling stock
     * @return The model texture
     */
    ResourceLocation getTexture(AbstractRollingStock<?> rollingStock);
    
    /**
     * Used to scale this model when rendered.
     *
     * @param rollingStock This rolling stock
     * @return The scale value
     */
    default float getModelScale(AbstractRollingStock<?> rollingStock){
        return 1.0F;
    }
    
    /**
     * Called by the renderer before the model nor the texture are applied to the render engine.
     * This is also before the {@link net.minecraft.client.renderer.GlStateManager#translate(double, double, double)} happens.
     * Can be used to render custom stuff.
     * Called every frame, so be careful when using this method.
     *
     * @param rollingStock This rolling stock
     * @param renderManager The renderer manager
     * @param x Drawing x position
     * @param y Drawing y position
     * @param z Drawing z position
     * @param entityYaw This entities yaw
     * @param partialTicks The partial ticks to apply for smooth rotating and movement
     */
    default void preRender(AbstractRollingStock<?> rollingStock, RenderManager renderManager, double x, double y, double z, float entityYaw, float partialTicks){}
    
    /**
     * Called by the renderer after the model has be rendered.
     * Can be used to render custom stuff.
     * Called every frame, so be careful when using this method.
     *
     * @param rollingStock This rolling stock
     * @param renderManager The renderer manager
     * @param x Drawing x position
     * @param y Drawing y position
     * @param z Drawing z position
     * @param entityYaw This entities yaw
     * @param partialTicks The partial ticks to apply for smooth rotating and movement
     */
    default void postRender(AbstractRollingStock<?> rollingStock, RenderManager renderManager, double x, double y, double z, float entityYaw, float partialTicks){}
    
    /**
     * Gets the inventory handler for this rolling stock.
     * This is the replacement for the IInventory handler used in the old Traincraft.
     * Returning null would mean that this rolling stock has no inventory.
     *
     * @param rollingStock This rolling stock
     * @param side The side at which it tries to interact with. CAN BE NULL!
     * @return The {@link IItemHandler} for the specified side
     */
    default IItemHandler getInventory(AbstractRollingStock<?> rollingStock, @Nullable EnumFacing side){
        return null;
    }
    
    /**
     * Gets the fluid handler for this rolling stock.
     * Returning null would mean that this rolling stock has no fluid storage.
     *
     * @param rollingStock This rolling stock
     * @param side The side at which it tries to interact with. CAN BE NULL!
     * @return The {@link IFluidHandler} for the specified side
     */
    default IFluidHandler getFluidTank(AbstractRollingStock<?> rollingStock, @Nullable EnumFacing side){
        return null;
    }
    
    /**
     * Gets the energy storage for this rolling stock.
     * Returning null would mean that this rolling stock has no energy storage.
     *
     * @param rollingStock This rolling stock
     * @param side The side at which it tries to interact with. CAN BE NULL!
     * @return The {@link IEnergyStorage} for the specified side
     */
    default IEnergyStorage getEnergyStorage(AbstractRollingStock<?> rollingStock, @Nullable EnumFacing side){
        return null;
    }
    
    /**
     * Called when a player right clicks this entity.
     * This is used to determine which seat should be used for the player.
     * This overwrites {@link net.minecraft.entity.Entity#applyPlayerInteraction(EntityPlayer, Vec3d, EnumHand)}.
     *
     * @param player The clicker
     * @param hand The hand used by the clicker
     * @param hitVec The vector at which the clicker hit this entity. Reference: {@link PlayerInteractEvent.EntityInteractSpecific#getLocalPos()}
     * @return The Result of this method.
     */
    @Nonnull
    EnumActionResult applyPlayerInteraction(@Nonnull EntityPlayer player, @Nonnull Vec3d hitVec, @Nonnull EnumHand hand);
    
    /**
     * This is called whenever a player right clicks this rolling stock with a item in his hand.
     * As an example this is used for connection two rolling stocks together: {@link traincraft.items.ItemConnector#handleEntityClick(AbstractRollingStock, EntityPlayer, EnumHand, ItemStack)}
     *
     * @param rollingStock The rolling stock that was clicked
     * @param player The player that clicked the rolling stock
     * @param hand The used hand of the player
     * @param stack The stack, the player hit the rolling stock with
     * @param hitVector The vector at which that player hit the rolling stock. Reference: {@link PlayerInteractEvent.EntityInteractSpecific#getLocalPos()}
     * @return True if the stack had some usage, that should prevent the player to start riding the rolling stock.
     */
    boolean handlePlayerClickWithItem(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player, @Nonnull EnumHand hand, @Nonnull ItemStack stack, @Nonnull Vec3d hitVector);
    
    /**
     * Use this method to add an axis to a rolling stock.
     * They get sorted on entity creation.
     * The default axis is the center of the entity.
     * The y-Axis can be ignored, since it doesn't matter.
     *
     * @param rollingStock This rolling stock
     * @param axes The list of axes already registered
     */
    default void addAxes(AbstractRollingStock<?> rollingStock, List<Vec3d> axes){}
    
    /**
     * This is used to check if this rollings stock can be connected to another rollings stock.
     * This should check if they are on the same rail and if there is no obstacle between them.
     *
     * @param rollingStock This rolling stock
     * @param other The rolling stock we want to connect
     * @param linker The player who wants to connect both. Can be null when the linker is not a player, but a command/...
     * @return True when this rolling stock can be connected to the other
     */
    boolean canLinkToAnotherRollingStock(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull AbstractRollingStock<?> other, @Nullable EntityPlayer linker);
    
    /**
     * This is called when both rolling stocks agreed to connect to each other.
     * This is also called on both rolling stocks.
     *
     * @param rollingStock This rolling stock
     * @param other The rolling stock we connect to
     * @param linker The player who wants to connect both. Can be null when the linker is not a player, but a command/...
     */
    void linkToAnotherRollingStock(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull AbstractRollingStock<?> other, @Nullable EntityPlayer linker);
    
    /**
     * This check if a player can open the gui or the container of this rolling stock.
     * This should check against the restriction rules ({@link EnumRestriction}) and
     * against the maximum distance the player can have to this entity.
     *
     * @param rollingStock This rolling stock
     * @param player The player
     * @return True when player is allowed to access gui or container
     */
    default boolean canPlayerOpenGuiOrContainer(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player){
        return false;
    }
    
    /**
     * Return some {@link GuiScreen} here, which is then displayed to the requesting player.
     *
     * @param rollingStock This rolling stock
     * @param player The player
     * @return A Gui to show to the player
     */
    @Nullable
    default GuiScreen openGui(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player){
        return null;
    }
    
    /**
     * Return some {@link Container} here, which is then displayed to the requesting player.
     *
     * @param rollingStock This rolling stock
     * @param player The player
     * @return A Container to show to the player
     */
    @Nullable
    default Container openContainer(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player){
        return null;
    }
    
    /**
     * This calculates motion for this rolling stock.
     * With this motion vector the next position is calculated.
     * This also has to drain the power from this rolling stock.
     * When front and back axis aren't null, they should be used instead of the currentPosition vector.
     *
     * @param rollingStock This rolling stock
     * @param currentPosition The current position
     * @return A motion vector
     */
    default Vec3d calculateMotion(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull Vec3d currentPosition){
        // todo calculate motionX, motionY and motionZ and apply these to this rolling stock
        // todo calculate the power usage and drain the power
        return Vec3d.ZERO;
    }
}
