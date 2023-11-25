package train.common.core.util;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackListener;
import net.minecraft.world.World;
import train.common.Traincraft;

import java.net.URL;

public class MP3Player extends PlaybackListener implements Runnable {
    private String streamURL;
    private AdvancedPlayer player;
    private Thread pThread;

    public MP3Player(String mp3url, World w, int id) {
        try {
            streamURL = mp3url;
            pThread = new Thread(this);
            pThread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            player = new AdvancedPlayer(new URL(streamURL).openStream());
            player.setPlayBackListener(this);
            player.play();
        } catch (Exception ignored) {
        }
    }

    public void stop() {
        if (player != null && isPlaying()) {
            player.stop();
        }
    }

    public boolean isPlaying() {
        return pThread.isAlive();
    }

    public void setVolume(float f) {
        if (player != null) {
            player.setVolume(f * Traincraft.proxy.getJukeboxVolume());
        }
    }

    public float getVolume() {
        if (player != null) {
            return player.getVolume();
        } else {
            return 0.0f;
        }
    }
}
