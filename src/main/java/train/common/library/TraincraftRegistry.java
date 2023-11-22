package train.common.library;

import java.util.ArrayList;
import train.common.api.TrainRecord;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.Item;
import train.client.render.RenderEnum;
import train.common.api.TrainRenderRecord;
import train.common.api.TrainSoundRecord;

public class TraincraftRegistry {

    private List<TrainRecord> trainRecords = new ArrayList<>();
    private Map<Item, TrainRecord> trainRecordsByItem = new HashMap<>();
    private Map<Class<?>, TrainRenderRecord> trainRenderRecords = new HashMap<>();
    private List<TrainSoundRecord> trainSoundRecords = new ArrayList<>();

    public TraincraftRegistry() {
    }

    public void init() {
        for (TrainRecord train : EnumTrains.trains()) {
            TraincraftRegistry.this.registerTrainRecord(train);
        }

        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            for (RenderEnum render : RenderEnum.values()) {
                TraincraftRegistry.this.registerTrainRenderRecord(render);
            }
        }

        for (TrainSoundRecord sound : EnumSounds.values()) {
            TraincraftRegistry.this.registerTrainSoundRecord(sound);
        }
    }

    public TrainRecord getTrainRecord(Class<?> entityClass) {
        if (entityClass == null) return null;

        for (TrainRecord record : trainRecords) {
            if (entityClass.equals(record.getEntityClass())) {
                return record;
            }
        }
        return null;
    }

    public TrainSoundRecord getTrainSoundRecord(Class<?> entityClass) {
        if (entityClass == null) return null;

        for (TrainSoundRecord record : trainSoundRecords) {
            if (entityClass.equals(record.getEntityClass())) {
                return record;
            }
        }
        return null;
    }

    public TrainRecord findTrainRecordByItem(Item item) {
        return trainRecordsByItem.get(item);
    }

    public TrainRenderRecord getTrainRenderRecord(Class<?> entityClass) {
        return trainRenderRecords.get(entityClass);
    }

    public void registerTrainRecord(TrainRecord record) {
        trainRecords.add(record);
        trainRecordsByItem.put(record.getItem(), record);
    }

    public void registerTrainRenderRecord(TrainRenderRecord record) {
        trainRenderRecords.put(record.getEntityClass(), record);
        addLivery(train.common.entity.rollingStock.EntityBoxCartUS.class, "burple");
    }

    public void registerTrainSoundRecord(TrainSoundRecord sound) {
        trainSoundRecords.add(sound);
    }

    public void addLivery(Class<?> entityClass, String name){
        for (TrainRecord record : trainRecords) {
            if (entityClass.equals(record.getEntityClass())) {
                record.skins.add(name);
            }
        }
    }
}
