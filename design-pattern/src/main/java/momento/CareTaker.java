package momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Editor> list;

    public CareTaker() {
        list = new ArrayList<>();
    }

    public void add(Editor editor) {
        list.add(editor);
    }

    public Editor getEditor() {
        return list.get(1);
    }
}
