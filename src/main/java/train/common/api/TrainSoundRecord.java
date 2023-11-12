package train.common.api;

public interface TrainSoundRecord {

    Class getEntityClass();

    String getHornString();

    String getRunString();

    String getIdleString();

    Float getHornVolume();

    Float getRunVolume();

    Float getIdleVolume();

    int getRunSoundLenght();

    int getIdleSoundLenght();

    boolean getSoundChangeWithSpeed();
}
