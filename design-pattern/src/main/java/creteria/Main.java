package creteria;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Pann", "Small", "Pant"),
                new Item("Hoas", "Small", "short"),
                new Item("Soa", "Big", "short"),
                new Item("Liv", "Small", "Shirt"),
                new Item("Addidas", "Small", "Shirt")
        );
        Pant pant = new Pant();
        pant.CriteriaType(items);
        System.out.println(pant.CriteriaType(items).size());
        System.out.println(pant.CriteriaSize(items).size());

        System.out.println("--------------");
        Shirt shirt = new Shirt();
        System.out.println(shirt.CriteriaType(items).size());
        System.out.println(shirt.CriteriaSize(items).size());

    }
}
