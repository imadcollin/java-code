package adapter;

public class Adapter implements AdvancePlayer {
    private AdvancePlayer advancePlayer;

    public Adapter(String file) {
        if (file != null && !file.equals("")) {
            if (getFileExtension(file).equalsIgnoreCase("midi")) advancePlayer = new MidiPlayer();
        }
        if (file != null && !file.equals("")) {
            if (getFileExtension(file).equalsIgnoreCase("mp3")) advancePlayer = new Mp3Player();
        }
    }

    @Override
    public void playMidi(String file) {
        if (getFileExtension(file).equalsIgnoreCase("midi"))

            advancePlayer.playMidi(file);
    }

    private static String getFileExtension(String file) {
        int i = file.lastIndexOf(".");
        if (i > 0) return file.substring(i + 1);

    }
}
