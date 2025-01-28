package mentor15.Adapter;

public class MediaPlayerAdapter implements MediaPlayer {
    private OldMediaPlayer player;


    public MediaPlayerAdapter (OldMediaPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.playOldFormat();
    }
}