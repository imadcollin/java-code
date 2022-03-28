package commercial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApiMock {
    public static List<Product> getProductAsList() {
        Product p1 = new Product(1, "omnis quod consequatur", "Games", 184.83);
        Product p2 = new Product(2, "vel libero suscipit", "Toys", 12.66);
        Product p3 = new Product(3, "non nemo iure", "Grocery", 498.02);
        Product p4 = new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80);
        Product p5 = new Product(5, "animi cum rem", "Games", 458.20);
        Product p6 = new Product(6, "dolorem porro debitis", "Toys", 146.52);
        Product p7 = new Product(7, "aspernatur rerum qui", "Books", 656.42);
        Product p8 = new Product(8, "deleniti earum et", "Books", 41.46);
        return Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public static List<Customer> getCustomersAsList() {
        Customer c1 = new Customer(1, "Stefan Walker", 1);
        Customer c2 = new Customer(2, "Daija Von", 1);
        Customer c3 = new Customer(3, "Ariane Rodriguez", 1);
        Customer c4 = new Customer(4, "Marques Nikolaus", 2);
        Customer c5 = new Customer(5, "Rachelle Greenfelder", 0);
        Customer c6 = new Customer(6, "Larissa White", 2);
        Customer c7 = new Customer(7, "Fae Heidenreich", 1);
        Customer c8 = new Customer(8, "Dino Will", 2);
        return Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8);

    }

    public static List<Order> getOrdersAsList() {
        Order order = new Order(35, "2021-03-15", "2021-03-17", "NEW");
        Order order1 = new Order(36, "2021-03-04", "2021-03-08", "DELIVERED");
        Order order2 = new Order(37, "2021-03-18", "2021-03-25", "NEW");
        Order order3 = new Order(38, "2021-04-11", "2021-04-20", "NEW");
        Order order4 = new Order(39, "2021-04-12", "2021-04-17", "NEW");
        Order order5 = new Order(40, "2021-03-12", "2021-03-12", "PENDING");
        Order order6 = new Order(41, "2021-02-24", "2021-02-26", "NEW");


        List<Product> l1 = getProductAsList().stream().filter(x -> x.getId() < 4).collect(Collectors.toList());
        List<Product> l2 = getProductAsList().stream().filter(x -> x.getId() > 4).collect(Collectors.toList());
        List<Product> l3 = getProductAsList().stream().filter(x -> x.getId() > 6).collect(Collectors.toList());
        order.setProducts(l1);
        order1.setProducts(l2);
        order2.setProducts(l3);
        return Arrays.asList(order, order1, order2, order3, order4, order5, order6);
    }

    public static List<Product> getProductsByKeys(String category) {
        HashMap<String, List<Product>> hashMap = new HashMap<>();
        hashMap.put("Toys", getProductAsList().stream().filter(x -> x.getCategory().equals("Toys")).collect(Collectors.toList()));
        hashMap.put("Games", getProductAsList().stream().filter(x -> x.getCategory().equals("Games")).collect(Collectors.toList()));
        hashMap.put("Books", getProductAsList().stream().filter(x -> x.getCategory().equals("Books")).collect(Collectors.toList()));
        return hashMap.get(category);
    }
    public List<Order> getOrderesByCa(){
        Stream<Order> s = getOrdersAsList().stream().filter(x -> x.getProducts().stream().anyMatch(y -> y.getCategory().equals("Toys")));
    return null;
    }

}
