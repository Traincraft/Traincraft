package ebf.tim.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import java.util.Random;

/**
 * <h2>Fluid Block</h2>
 * similar to the vanilla fluid block, but allows setting for flammable fluids.
 * TODO: it may be possible to use this to house all the fluid data, meaning bucket, fluid, and block.
 *
 * @author Eternal Blue Flame
 */
public class BlockTrainFluid extends BlockFluidClassic {
    /**the texture for the block, the first value is the top and bottom, the second is for the sides.*/
    @SideOnly(Side.CLIENT)
    private IIcon[] sidedTexture;
    private String modID= TrainsInMotion.MODID;
    /**returns if this is flammable*/
    private boolean flammable = false;
    /**returns the flammability of this*/
    private int flammability = 0;

    public BlockTrainFluid(Fluid fluid, Material material) {
        super(fluid, material);
    }

    /**
     * <h3>define texture</h3>
     * uses the sidedTexture to define the texture for the block.
     */
    @Override
    public IIcon getIcon(int side, int meta) {
        if (this.sidedTexture == null){
            return null;
        }
        return side != 0 && side != 1 ? this.sidedTexture[1] : this.sidedTexture[0];
    }

    public void setModID(String id){
        modID=id;
    }

    /**
     * <h3>Register iicon</h3>
     * used to register the icon for the block.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.sidedTexture = new IIcon[]{iconRegister.registerIcon(modID+":fluids/"+fluidName), iconRegister.registerIcon(modID+":fluids/"+fluidName +"_flow")};
    }

    /**
     * <h3>flammability</h3>
     * allows you to set the flammability of the block, this allows for a check if it can be set on fire and if it is the source of the fire.
     * similar to lava.
     * The following functions use this information to define how the fire spreads.
     */
    public BlockTrainFluid setFlammable(boolean flammable, int flammability) {
        this.flammable = flammable;
        this.flammability = flammability;
        return this;
    }

    @Override
    public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face) {return flammable ? 300 : 0;}

    @Override
    public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face) {return flammability;}

    @Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
        return flammable;
    }

    @Override
    public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side) {return flammable && flammability == 0;}

    /**
     * disable host tick system
     */
    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        int fluidHeight = quantaPerBlock - world.getBlockMetadata(x, y, z);
        int newHeight = -101;

        // check adjacent block levels if non-source
        if (fluidHeight < quantaPerBlock) {
            int y2 = y - densityDir;

            if (world.getBlock(x,y2,z) == this ||
                    world.getBlock(x - 1, y2, z) == this ||
                    world.getBlock(x + 1, y2, z) == this ||
                    world.getBlock(x,y2, z - 1) == this ||
                    world.getBlock(x, y2, z + 1) == this)
            {
                newHeight = quantaPerBlock - 1;
            } else {
                int maxQuanta = -100;
                maxQuanta = getLargerQuanta(world, x - 1, y, z, maxQuanta);
                maxQuanta = getLargerQuanta(world, x + 1, y, z, maxQuanta);
                maxQuanta = getLargerQuanta(world, x,y, z - 1, maxQuanta);
                maxQuanta = getLargerQuanta(world, x, y, z + 1, maxQuanta);

                newHeight = maxQuanta - 1;
            }

            // decay calculation
            if (newHeight != fluidHeight) {
                fluidHeight = newHeight;

                if (newHeight <= 0) {
                    world.setBlock(x, y, z, Blocks.air);
                } else {
                    world.setBlockMetadataWithNotify(x, y, z, quantaPerBlock - newHeight, 3);
                    world.scheduleBlockUpdate(x, y, z, this, tickRate);
                    world.notifyBlocksOfNeighborChange(x, y, z, this);
                }
            }
        }
        // This is a "source" block, set meta to zero, and send a server only update
        else if (fluidHeight != quantaPerBlock) {
            world.setBlockMetadataWithNotify(x, y, z, 0, 2);
        }

        // Flow vertically if possible
        if (canDisplace(world, x, y + densityDir, z)) {
            flowIntoBlock(world, x, y + densityDir, z, 1);
            return;
        }

        // Flow outward if possible
        int flowMeta = quantaPerBlock - fluidHeight + 1;
        if (flowMeta >= quantaPerBlock) {
            return;
        }

        if (isSourceBlock(world, x, y, z) || !isFlowingVertically(world, x, y, z)) {
            if (world.getBlock(x, y - densityDir, z) == this) {
                flowMeta = 1;
            }
            boolean[] flowTo = getOptimalFlowDirections(world, x, y, z);

            if (flowTo[0]) flowIntoBlock(world, x - 1, y, z,flowMeta);
            if (flowTo[1]) flowIntoBlock(world, x + 1, y, z,flowMeta);
            if (flowTo[2]) flowIntoBlock(world, x,y, z - 1, flowMeta);
            if (flowTo[3]) flowIntoBlock(world, x,y, z + 1, flowMeta);
        }

    }

    @Override
    protected boolean[] getOptimalFlowDirections(World world, int x, int y, int z) {
        int x2,z2;
        for (int side = 0; side < 4; side++) {
            flowCost[side] = 1000;

            x2 = x;
            z2 = z;

            switch (side) {
                case 0: --x2; break;
                case 1: ++x2; break;
                case 2: --z2; break;
                case 3: ++z2; break;
            }

            if (!canFlowInto(world, x2, y, z2) || isSourceBlock(world, x2, y, z2)) {
                continue;
            }

            if (canFlowInto(world, x2, y + densityDir, z2)) {
                flowCost[side] = 0;
            }
            else {
                flowCost[side] = calculateFlowCost(world, x2, y, z2, 1, side);
            }
        }

        int min = Math.min(Math.min(flowCost[0], flowCost[1]), Math.min(flowCost[2], flowCost[3]));
        for (int side = 0; side < 4; side++) {
            isOptimalFlowDirection[side] = flowCost[side] == min;
        }
        return isOptimalFlowDirection;
    }

    @Override
    protected int calculateFlowCost(World world, int x, int y, int z, int recurseDepth, int side) {
        int cost = 1000, x2, z2;
        for (int adjSide = 0; adjSide < 4; adjSide++) {
            if ((adjSide == 0 && side == 1) ||
                    (adjSide == 1 && side == 0) ||
                    (adjSide == 2 && side == 3) ||
                    (adjSide == 3 && side == 2)) {
                continue;
            }

            x2 = x;
            z2 = z;

            switch (adjSide) {
                case 0: --x2; break;
                case 1: ++x2; break;
                case 2: --z2; break;
                case 3: ++z2; break;
            }

            if (!canFlowInto(world, x2, y, z2) || isSourceBlock(world, x2, y, z2)) {
                continue;
            }

            if (canFlowInto(world, x2, y + densityDir, z2)) {
                return recurseDepth;
            }

            if (recurseDepth >= 4) {
                continue;
            }

            cost=Math.min(cost, calculateFlowCost(world, x2, y, z2, recurseDepth + 1, adjSide));
        }
        return cost;
    }

    @Override
    protected void flowIntoBlock(World world, int x, int y, int z, int meta) {
        if (meta>=0 && displaceIfPossible(world, x, y, z)) {
            world.setBlock(x, y, z, this, meta, 3);
        }
    }

    @Override
    protected boolean canFlowInto(IBlockAccess world, int x, int y, int z) {
        Block block = world.getBlock(x, y, z);
        if (block.isAir(world, x, y, z) || block == this){
            return true;
        } else if (displacements.containsKey(block)) {
            return displacements.get(block);
        } else if (block.getMaterial().blocksMovement()  ||
                block.getMaterial() == Material.water ||
                block.getMaterial() == Material.lava  ||
                block.getMaterial() == Material.portal)
        {
            return false;
        }

        int density = getDensity(world, x, y, z);

        return density == Integer.MAX_VALUE || this.density > density;
    }

    @Override
    protected int getLargerQuanta(IBlockAccess world, int x, int y, int z, int compare) {
        if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z) != this){
            return compare;
        } else {
            return Math.max(quantaPerBlock - world.getBlockMetadata(x, y, z), compare);
        }
    }


}
