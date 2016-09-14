package si.meansoft.traincraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.gen.WorldGen;
import si.meansoft.traincraft.items.ItemBlockBase;
import si.meansoft.traincraft.network.CommonProxy;

/**
 * @author canitzp
 */
public class BlockBase extends Block implements IRegistryEntry{

    private String name;

    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        this.setCreativeTab(Traincraft.generalTab);
        this.setUnlocalizedName(Traincraft.MODID + "." + name);
        this.name = name;
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
        //OreDictionary.registerOre(oreDict, this);
        CommonProxy.oreDicts.put(this, oreDict);
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

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this, new ItemBlockBase(this)};
    }

    @Override
    public String getRegisterName(){
        return this.name;
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){
        for(IRegistryEntry entry : otherEntries){
            if(entry instanceof ItemBlock){
                CommonProxy.addForgeRender((Item) entry);
                return;
            }
        }
    }

    @Override
    public void ownRegistry(){

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

}
