package si.meansoft.traincraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.gen.WorldGen;
import si.meansoft.traincraft.network.CommonProxy;

/**
 * @author canitzp
 */
public class BlockBase extends Block {

    public boolean forgeModel = false;

    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        Traincraft.registerBlock(this, name);
    }

    /**
     * @param toSpawnInside The Block it'll spawn inside. e.g.: Coal='net.minecraft.init.Blocks.stone'
     * @param minY The minimal height for the Block to spawn. e.g.: Coal=0
     * @param maxY The maximal height for the Block to spawn. e.g.: Coal=128
     * @param maxVeinSize The maximal amount of Blocks at one place. e.g.: Coal=17
     * @param chanceToSpawn The Chance to spawn the Block. e.g.: Coal=20
     * The example values you'll find in the class: 'net.minecraft.world.gen.ChunkProviderSettings'
     */
    public BlockBase generateBlock(Block toSpawnInside, int minY, int maxY, int maxVeinSize, int chanceToSpawn){
        WorldGen.addBlockToSpawn(this, toSpawnInside, minY, maxY, maxVeinSize, chanceToSpawn);
        return this;
    }

    public BlockBase addOreDict(String oreDict){
        OreDictionary.registerOre(oreDict, this);
        return this;
    }

    public BlockBase setForgeModel(String name){
        CommonProxy.addForgeRender(this, new ResourceLocation(name));
        return this;
    }
    public BlockBase setForgeModel(){
        return setForgeModel(getRegistryName());
    }

}
