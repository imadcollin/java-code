package interfaces;

public interface MultiMethodInterface {
    public abstract void printAbstract();

    public static void printStatic() {
        System.out.println("static method");

    }

    public default void printDefault() {
        System.out.println("Default method");
    }
}

class Methods implements MultiMethodInterface {

    @Override
    public void printAbstract() {
        System.out.println("Abstract Method");
    }

    @Override
    public void printDefault() {
        MultiMethodInterface.super.printDefault();
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.printAbstract();
        m.printDefault();
        MultiMethodInterface.printStatic();
    }

}

