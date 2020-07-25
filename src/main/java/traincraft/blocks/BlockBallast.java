package traincraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import traincraft.Traincraft;

public class BlockBallast extends BaseBlock {
    public BlockBallast() {
        super(Material.ROCK);
        this.setRegistryName(Traincraft.MOD_ID, "ballast");

        this.setCreativeTab(Traincraft.TAB);
        this.setHardness(3.0F);
        this.setResistance(15F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1); //TODO check if this correct (should be stone)
    }
}
