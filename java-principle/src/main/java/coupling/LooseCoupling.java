package coupling;

public class LooseCoupling {
    static interface Printer {
        void print();
    }

    static class A implements Printer {
        private Printer p;

        public A(Printer p) {
            this.p = p;
        }

        @Override
        public void print() {
            p.print();
        }
    }

    static class B implements Printer {

        public B() {

        }

        @Override
        public void print() {
            System.out.println("Print from B class ...");
        }
    }

    static class C implements Printer {

        public C() {

        }

        @Override
        public void print() {
            System.out.println("Print from C class ...");
        }
    }

    public static void main(String[] args) {
        Printer b = new B();
        Printer a = new A(b);

        a.print();
        Printer c = new C();
        a = new A(c);

        a.print();
    }
}
