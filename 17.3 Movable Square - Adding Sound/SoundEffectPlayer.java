import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.util.HashMap;
import java.util.Map;

public class SoundEffectPlayer {

    private Media soundMedia;
    private MediaPlayer soundPlayer;
    private static final Map<String, MediaPlayer> mediaPlayerMap =
        new HashMap<>();

    public SoundEffectPlayer(String path) {
        setSoundPath(path);
    }

    public void play() {
        if (soundPlayer != null &&
                soundPlayer.getStatus() != MediaPlayer.Status.PLAYING) {
            soundPlayer.play();
        }
    }

    public void stop() {
        if (soundPlayer != null &&
                soundPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            soundPlayer.stop();
        }
    }

    private void setSoundPath(String path) {
        if (!mediaPlayerMap.containsKey(path)) {
            soundMedia = new Media(path);
            soundPlayer = new MediaPlayer(soundMedia);
            soundPlayer.setOnEndOfMedia(() -> soundPlayer.stop());
            mediaPlayerMap.put(path, soundPlayer);
        } else {
            soundPlayer = mediaPlayerMap.get(path);
        }
    }

    public static void stopAllSounds() {
        for (MediaPlayer mediaPlayer : mediaPlayerMap.values()) {
            if (mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
                mediaPlayer.stop();
            }
        }
    }
}
