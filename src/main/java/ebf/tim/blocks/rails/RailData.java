package ebf.tim.blocks.rails;

import ebf.tim.blocks.RailTileEntity;
import ebf.tim.utility.DebugUtil;
import net.minecraft.block.BlockRailBase;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class RailData {
    private World world;
    private int xCoord;
    private int yCoord;
    private int zCoord;
    private List<ChunkPosition> nearbyRails = new ArrayList<>();

    public RailData(World p_i45388_2_, int p_i45388_3_, int p_i45388_4_, int p_i45388_5_) {
        this.world = p_i45388_2_;
        this.xCoord = p_i45388_3_;
        this.yCoord = p_i45388_4_;
        this.zCoord = p_i45388_5_;


        this.nearbyRails.clear();
        switch (BlockRailCore.getRailMeta(world, p_i45388_3_, p_i45388_4_, p_i45388_5_, null)){
            case 0: {
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord - 1));
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord + 1));
                break;
            }
            case 1: {
                this.nearbyRails.add(new ChunkPosition(this.xCoord - 1, this.yCoord, this.zCoord));
                this.nearbyRails.add(new ChunkPosition(this.xCoord + 1, this.yCoord, this.zCoord));
                break;
            }
            case 2:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord - 1, this.yCoord, this.zCoord));
                this.nearbyRails.add(new ChunkPosition(this.xCoord + 1, this.yCoord + 1, this.zCoord));
                break;
            }
            case 3:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord - 1, this.yCoord + 1, this.zCoord));
                this.nearbyRails.add(new ChunkPosition(this.xCoord + 1, this.yCoord, this.zCoord));
                break;
            }
            case 4:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord + 1, this.zCoord - 1));
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord + 1));
                break;
            }
            case 5:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord - 1));
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord + 1, this.zCoord + 1));
                break;
            }
            case 6:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord + 1, this.yCoord, this.zCoord));
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord + 1));
                break;
            }
            case 7:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord - 1, this.yCoord, this.zCoord));
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord + 1));
                break;
            }
            case 8:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord - 1, this.yCoord, this.zCoord));
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord - 1));
                break;
            }
            case 9:{
                this.nearbyRails.add(new ChunkPosition(this.xCoord + 1, this.yCoord, this.zCoord));
                this.nearbyRails.add(new ChunkPosition(this.xCoord, this.yCoord, this.zCoord - 1));
                break;
            }
        }
    }

    private RailData checkYpositions(ChunkPosition p_150654_1_) {
        for (int y=-1; y<2;y++){
            if(this.world.getBlock(p_150654_1_.chunkPosX, p_150654_1_.chunkPosY+y, p_150654_1_.chunkPosZ) instanceof BlockRailBase){
                return new RailData(this.world, p_150654_1_.chunkPosX, p_150654_1_.chunkPosY+y, p_150654_1_.chunkPosZ);
            }
        }
        return null;
    }

    private boolean nearbyContains(int p_150652_1_, int p_150652_3_) {
        for (ChunkPosition chunkposition : this.nearbyRails) {
            if (chunkposition.chunkPosX == p_150652_1_ && chunkposition.chunkPosZ == p_150652_3_) {
                return true;
            }
        }
        return false;
    }


    private boolean func_150647_c(int p_150647_1_, int p_150647_2_, int p_150647_3_) {
        RailData rail = this.checkYpositions(new ChunkPosition(p_150647_1_, p_150647_2_, p_150647_3_));

        if (rail == null) {
            return false;
        } else {
            RailData otherRail;
            for (int i = 0; i < rail.nearbyRails.size(); ++i) {
                otherRail = rail.checkYpositions(rail.nearbyRails.get(i));

                if (otherRail != null && otherRail.nearbyContains(rail.xCoord,rail.zCoord)) {
                    rail.nearbyRails.set(i, new ChunkPosition(otherRail.xCoord, otherRail.yCoord, otherRail.zCoord));
                } else {
                    rail.nearbyRails.remove(i--);
                }
            }
            return rail.nearbyRails.size()!=2 || rail.nearbyContains(this.xCoord,this.zCoord);
        }
    }

    public void rebuildRailMeta() {
        if(world.getTileEntity(this.xCoord, this.yCoord, this.zCoord) instanceof RailTileEntity) {
            boolean flagzm = this.func_150647_c(this.xCoord, this.yCoord, this.zCoord - 1);
            boolean flagzp = this.func_150647_c(this.xCoord, this.yCoord, this.zCoord + 1);
            boolean flagxm = this.func_150647_c(this.xCoord - 1, this.yCoord, this.zCoord);
            boolean flagxp = this.func_150647_c(this.xCoord + 1, this.yCoord, this.zCoord);
            byte meta = -1;

            if ((flagzm || flagzp) && !flagxm && !flagxp) {
                meta = 0;
            }

            if ((flagxm || flagxp) && !flagzm && !flagzp) {
                meta = 1;
            }

            if (flagzp && flagxp && !flagzm && !flagxm) {
                meta = 6;
            }

            if (flagzp && flagxm && !flagzm && !flagxp) {
                meta = 7;
            }

            if (flagzm && flagxm && !flagzp && !flagxp) {
                meta = 8;
            }

            if (flagzm && flagxp && !flagzp && !flagxm) {
                meta = 9;
            }

            if (meta == -1) {
                if (flagzm || flagzp) {
                    meta = 0;
                }

                if (flagxm || flagxp) {
                    meta = 1;
                }

                if (world.isBlockIndirectlyGettingPowered(xCoord,yCoord,zCoord)) {
                    if (flagzp && flagxp) {
                        meta = 6;
                    }

                    if (flagxm && flagzp) {
                        meta = 7;
                    }

                    if (flagxp && flagzm) {
                        meta = 9;
                    }

                    if (flagzm && flagxm) {
                        meta = 8;
                    }


                }
                else {
                    if (flagzm && flagxm) {
                        meta = 8;
                    }

                    if (flagxp && flagzm
                            && BlockRailCore.getRailMeta(world,xCoord+1,yCoord,zCoord,null)!=0
                            && BlockRailCore.getRailMeta(world,xCoord,yCoord,zCoord-1,null)!=1) {
                        //yes i realize this is even hackier than vanilla. it's necessary.
                        meta = 9;
                    }

                    if (flagxm && flagzp
                            && BlockRailCore.getRailMeta(world,xCoord,yCoord,zCoord+1,null)!=1) {
                        meta = 7;
                    }

                    if (flagzp && flagxp
                            && BlockRailCore.getRailMeta(world,xCoord+1,yCoord,zCoord,null)!=0
                            && BlockRailCore.getRailMeta(world,xCoord,yCoord,zCoord+1,null)!=1) {
                        //yes i realize this is even hackier than vanilla. it's necessary.
                        meta = 6;
                    }
                }
            }

            if (meta == 0) {
                //cover wye switches
                if(BlockRailCore.getRailMeta(world, this.xCoord-1, this.yCoord, this.zCoord, null)==8 &&
                        BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord-1, null)==-1){
                    meta=7;
                } else if(BlockRailCore.getRailMeta(world, this.xCoord+1, this.yCoord, this.zCoord, null)==9 &&
                        BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord-1, null)==-1){
                    meta=6;
                } else if(BlockRailCore.getRailMeta(world, this.xCoord-1, this.yCoord, this.zCoord, null)==7 &&
                        BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord+1, null)==-1){
                    meta=8;
                } else if(BlockRailCore.getRailMeta(world, this.xCoord+1, this.yCoord, this.zCoord, null)==6 &&
                        BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord+1, null)==-1){
                    meta=9;
                }
                //cover slopes
                if (this.world.getBlock(this.xCoord, this.yCoord + 1, this.zCoord - 1) instanceof BlockRailBase) {
                    meta = 4;
                }

                if (this.world.getBlock(this.xCoord, this.yCoord + 1, this.zCoord + 1) instanceof BlockRailBase) {
                    meta = 5;
                }
            }

            if (meta == 1) {
                //cover wye switches
                if(BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord-1, null)==8 &&
                        BlockRailCore.getRailMeta(world, this.xCoord-1, this.yCoord, this.zCoord, null)==-1){
                    meta=9;
                } else if(BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord+1, null)==7 &&
                        BlockRailCore.getRailMeta(world, this.xCoord-1, this.yCoord, this.zCoord, null)==-1){
                    meta=6;
                } else if(BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord-1, null)==9 &&
                        BlockRailCore.getRailMeta(world, this.xCoord+1, this.yCoord, this.zCoord, null)==-1){
                    meta=8;
                } else if(BlockRailCore.getRailMeta(world, this.xCoord, this.yCoord, this.zCoord+1, null)==6 &&
                        BlockRailCore.getRailMeta(world, this.xCoord+1, this.yCoord, this.zCoord, null)==-1){
                    meta=7;
                }
                //cover slopes
                if (this.world.getBlock(this.xCoord + 1, this.yCoord + 1, this.zCoord) instanceof BlockRailBase) {
                    meta = 2;
                }

                if (this.world.getBlock(this.xCoord - 1, this.yCoord + 1, this.zCoord) instanceof BlockRailBase) {
                    meta = 3;
                }
            }

            if (meta < 0) {
                meta = 0;
            }

            ((RailTileEntity) world.getTileEntity(this.xCoord, this.yCoord, this.zCoord)).setMeta(meta);

        }
    }
}
