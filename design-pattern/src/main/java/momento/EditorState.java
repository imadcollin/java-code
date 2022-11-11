package momento;

public class EditorState {
    private String content;

    public EditorState(String state) {
        this.content = state;
    }

    public Editor save(String s) {
        return new Editor(s);
    }

    public void getState(Editor editor) {
        editor.getContent();
    }
}
