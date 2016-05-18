package si.meansoft.traincraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import si.meansoft.traincraft.blocks.*;

/**
 * @author canitzp
 */
public class BlockRegistry {

    public static Block oilSand;
    public static Block distillery, crafterSteam, crafterDiesel, crafterElectro;
    public static Block hearthFurnace;
    public static Block trackLongStraight;
    public static Block trackLongCurve;
    public static Block windmill;

    public static void preInit(){
        oilSand = new BlockBase(Material.SAND, "oilSand").generateBlock(Blocks.SAND, 50, 80, 7, 11).addOreDict("oreOilSand").setHarvestLevel(BlockBase.ToolEnum.SHOVEL, 2).setSound(SoundType.SAND);
        distillery = new BlockDistillery();
        crafterSteam = new BlockCrafter(BlockCrafter.CrafterTier.STEAM);
        crafterDiesel = new BlockCrafter(BlockCrafter.CrafterTier.DIESEL);
        crafterElectro = new BlockCrafter(BlockCrafter.CrafterTier.ELECTRO);
        hearthFurnace = new BlockHearthFurnace();
        windmill = new BlockWindmill();

        trackLongStraight = new BlockRail(BlockRail.TrackLength.LONG, BlockRail.TrackDirection.STRAIGHT, BlockRail.Rails.SHORTSTRAIGHT);
        //trackLongCurve = new BlockRail(BlockRail.TrackLength.SHORT, BlockRail.TrackDirection.CURVE, BlockRail.Rails.SHORTCURVE);
    }

}
