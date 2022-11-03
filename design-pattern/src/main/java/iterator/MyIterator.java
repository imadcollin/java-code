package iterator;

import java.util.Iterator;
import java.util.List;

public class MyIterator<T> implements Iterator<T> {
    private List<T> list = null;
    private int index = 0;

    public MyIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list.size() > index;
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
