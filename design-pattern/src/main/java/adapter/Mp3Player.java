package adapter;

public class Mp3Player implements MediaPlayer {
    @Override
    public void playMp3(String file) {
        System.out.println("Mp3 Player..."+ file);
    }

    @Override
    public void playMp4(String file) {
//Do nothing
    }
}
