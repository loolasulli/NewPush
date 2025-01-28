package mentor15.Adapter;

public class Main {
    public static void main(String[] args) {
        OldMediaPlayer player = new OldMediaPlayer();
        MediaPlayer player1 = new MediaPlayerAdapter(player);
        player1.play();
    }
}