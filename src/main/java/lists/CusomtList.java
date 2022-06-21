package lists;

public class CusomtList<T> {
    public static int size;

    private static int CAPACITY = 10;
    public Object[] elements;

    public CusomtList() {
        this.size = 0;
        this.elements = new Object[CAPACITY];
    }

    public void add(T t) {
        if (notFull()) {
            elements[size] = t;
            size++;
        } else
            throw new ArrayIndexOutOfBoundsException("Not possible to store the element");
    }

    private boolean notFull() {
        return elements.length != size;
    }

    public void delete(int index) {
        if (elements.length > 0 && size >= 0) {
            elements[index] = null;
            size--;
        } else
            throw new ArrayIndexOutOfBoundsException("Not possible to delete elements");

    }

    public T get(int index) {
        if (elements.length > 0 && size >= index) {
            return (T) elements[index];
        } else
            throw new ArrayIndexOutOfBoundsException("Not possible to get elements");

    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CusomtList cusomtList = new CusomtList();
        cusomtList.add(1);
        cusomtList.add(2);
        cusomtList.add(4);

        System.out.println(cusomtList.getSize());
        System.out.println(cusomtList.get(0));
        System.out.println(cusomtList.get(1));
        System.out.println(cusomtList.get(2));

        System.out.println("Size before:" + cusomtList.getSize());

        cusomtList.delete(1);
        System.out.println("Size after:" + cusomtList.getSize());

    }
}
