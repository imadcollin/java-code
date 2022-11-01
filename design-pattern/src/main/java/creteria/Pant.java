package creteria;

import java.util.List;
import java.util.stream.Collectors;

public class Pant implements IClothes {
    public Pant() {
    }

    @Override
    public List<Item> CriteriaType(List<Item> items) {
        return items.stream().filter(item -> item.getType().equalsIgnoreCase("Pant")).collect(Collectors.toList());
    }

    @Override
    public List<Item> CriteriaSize(List<Item> items) {
        return items.stream().filter(item -> item.getSize().equalsIgnoreCase("Small")).collect(Collectors.toList());
    }
}
