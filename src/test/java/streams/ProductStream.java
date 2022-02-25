package streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductStream {
    public static List<Product> getListOfProducts() {
        return Arrays.asList(new Product(1, "Home", 25),
                new Product(2, "Shop", 55), new Product(3, "Garden", 66));
    }

    public Map<Integer, String> listToMap(List<Product> productList) {
        List<Product> products = getListOfProducts();

        return products.stream().collect(Collectors.toMap(Product::getId, Product::getName));
    }

    public Map<Integer, String> listToMapWithORders(List<Product> productList) {

        return productList.stream().collect(Collectors.toMap(Product::getId, Product::getName, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    @Test
    public void testLIstToMap() {
        Assertions.assertEquals(3, listToMap(getListOfProducts()).size());
        Assertions.assertEquals("Home", listToMap(getListOfProducts()).get(1));
    }

    @Test
    public void testLIstToMapOrder() {
        List<Product> list = Arrays.asList(new Product(1, "Home", 25),
                new Product(2, "Shop", 55), new Product(3, "Garden", 66), new Product(1, "Office", 60));
        Assertions.assertEquals(3, listToMapWithORders(list).size());
        Assertions.assertEquals("Home", listToMapWithORders(getListOfProducts()).get(1));
    }

}


