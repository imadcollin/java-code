package adapter;

public class Mp4Player implements MediaPlayer {
    @Override
    public void playMp3(String file) {
//Do nothing ...
    }

    @Override
    public void playMp4(String file) {
        System.out.println("Mp4 Player... ! "+file);
    }
}
