package coupling;

public class TightCoupling {

    static class A {
        private B b;

        public A() {
            b = new B();
        }

        public void print() {
            b.print();
        }
    }

    static class B {

        public B() {

        }

        public void print() {
            System.out.println("Print from B class ...");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
