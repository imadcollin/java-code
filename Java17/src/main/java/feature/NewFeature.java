package feature;

public class NewFeature {

    public String switchCase(String str) {
        return switch (str) {
            case "hello" -> "hello world";
            case "bye" -> "good bye";
        };
    }

    public String switchCase2(String day) {
        return switch (day) {
            case "mon", "tues":
                yield "working";
            case "sat", "sun":
                yield "holiday";
            default:
                yield "none";
        };
    }
}

class Person {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


}