package creteria;

import java.util.List;
import java.util.stream.Collectors;

public class Short implements IClothes {

    @Override
    public List<Item> CriteriaType(List<Item> items) {
        return items.stream().filter(item -> item.getType().equalsIgnoreCase("Short")).collect(Collectors.toList());
    }

    @Override
    public List<Item> CriteriaSize(List<Item> items) {
        return items.stream().filter(item -> item.getSize().equalsIgnoreCase("small")).collect(Collectors.toList());
    }
}
