package genrics;

public class Cat implements IAnimal {

    public String getName() {
        return name;
    }

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cats eat food");
    }

    @Override
    public void speak() {
        System.out.println("Meo...");
    }
}
