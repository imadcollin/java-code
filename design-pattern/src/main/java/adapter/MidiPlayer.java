package adapter;

public class MidiPlayer implements AdvancePlayer{
    @Override
    public void playMidi(String file) {
        System.out.println("Midi Player ...!"+ file);
    }
}
