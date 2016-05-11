package si.meansoft.traincraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.gen.WorldGen;
import si.meansoft.traincraft.network.CommonProxy;

/**
 * @author canitzp
 */
public class BlockBase extends Block {

    private Block instance;

    public BlockBase(Material materialIn, String name, RenderType renderType) {
        super(materialIn);
        Traincraft.registerBlock(this, name, renderType);
        this.instance = ForgeRegistries.BLOCKS.getValue(getRegistryName());
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
        WorldGen.addBlockToSpawn(this.instance, toSpawnInside, minY, maxY, maxVeinSize, chanceToSpawn);
        return this;
    }

    public BlockBase addOreDict(String oreDict){
        OreDictionary.registerOre(oreDict, this.instance);
        return this;
    }

    public BlockBase setHarvestLevel(ToolEnum tool, int hardness){
        setHarvestLevel(tool.tool, hardness);
        return this;
    }

    public BlockBase setSound(SoundType sound){
        setSoundType(sound);
        return this;
    }

    public enum ToolEnum{
        PICKAXE("pickaxe"),
        AXE("axe"),
        SHOVEL("shovel");
        public String tool;
        ToolEnum(String tool) {
            this.tool = tool;
        }
    }

    public enum  RenderType{
        NORMAL,
        FORGEJSON,
        OBJ
    }

}
