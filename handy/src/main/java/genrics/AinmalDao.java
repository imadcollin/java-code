package genrics;

import java.util.List;

public class AinmalDao {

    public List<Dog> getDogs() {
        return List.of(new Dog("Bobby"), new Dog("Sos"), new Dog("Ror"));
    }

    public List<Cat> getCats() {
        return List.of(new Cat("Cat1"), new Cat("Cat2"), new Cat("Cat3"));
    }

    public static void prittAnimals(List<? extends IAnimal> list) {
        for (IAnimal animal : list
        ) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println((cat.getName()));
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println((dog.getName()));
            }
        }
    }
}
