package lists;

public class Circulate<T> {

    private T[] els;
    int step;

    public Circulate(final T... elements) throws Exception {
        if(elements.length==0) throw new IllegalArgumentException();
        this.els = elements;
        this.step = -1;
    }

    T next() {
        if(step >= els.length-1)  step=-1;
        step++;

        T element = els[step];
        return element;
    }

    T prev() {
        if(step <=0) step=els.length;
        step--;
        T element = els[step];

        return element;
    }

}

