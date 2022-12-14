package genrics;

import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        Dog dog = new Dog("Mora");
        dog.eat();
        dog.speak();

        List<Integer> integerList = List.of(1, 2, 3);

        printList(integerList);
        List<String> stringList = List.of("one", "two", "three");
        printList(stringList);

        AinmalDao ainmalDao = new AinmalDao();
        ainmalDao.prittAnimals(ainmalDao.getDogs());
        ainmalDao.prittAnimals(ainmalDao.getCats());

    }

    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }

}
