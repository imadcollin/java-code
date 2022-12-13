package genrics;

public class Dog implements IAnimal {
    public String getName() {
        return name;
    }

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat meet..");
    }

    @Override
    public void speak() {
        System.out.println("Wooo...");
    }

}
