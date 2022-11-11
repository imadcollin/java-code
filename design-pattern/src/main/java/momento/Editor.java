package momento;

public class Editor {
    private String content;

    public Editor(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState save(String state){
        return new EditorState(state);
    }
}
