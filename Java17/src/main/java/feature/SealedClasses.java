package feature;

public class SealedClasses {

    class Person {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        String name;
        int age;
    }

    class Manger extends Person {
        int id;

        public Manger(String name, int age) {
            this.age = age;
            this.name = name;
        }
    }
}

