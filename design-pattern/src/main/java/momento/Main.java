package momento;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Editor editor = new Editor("A");
        editor.save("b");
        careTaker.add(editor);

        editor.save("c");
        careTaker.add(editor);

        EditorState editorState = new EditorState("AA");
        editorState.save("1");

        String content = careTaker.getEditor().getContent();
        System.out.println(content);
    }
}
