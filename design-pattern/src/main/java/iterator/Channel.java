package iterator;

public class Channel {
    private int idx;
    private String name;

    public int getIdx() {
        return idx;
    }

    public Channel(int idx, String name, TYPE type) {
        this.idx = idx;
        this.name = name;
        this.type = type;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    private TYPE type;
}
