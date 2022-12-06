public class DRY {
    public interface Animal {
        void eat();

        void walk();
    }

    public interface Bird {
        void fly();
    }

    public static class Dog implements Animal {

        @Override
        public void eat() {
            System.out.println("Dog can eat...");
        }

        @Override
        public void walk() {
            System.out.println("dog can walk...");
        }
    }

    public static class Cannary implements Animal, Bird {

        @Override
        public void eat() {
            System.out.println("Bird can eat... ");
        }

        @Override
        public void walk() {
            System.out.println("Bird can walk... ");

        }

        @Override
        public void fly() {
            System.out.println("Bird can fly... ");

        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();

        Cannary cannary = new Cannary();
        cannary.eat();
        cannary.walk();
        cannary.fly();
    }
}
