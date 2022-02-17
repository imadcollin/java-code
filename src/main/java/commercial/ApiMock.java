package commercial;

import ds.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

        Customer c1 = getCustomersAsList().get(0);
        Customer c2 = getCustomersAsList().get(1);
        Customer c3 = getCustomersAsList().get(2);

        order.setCustomer(Arrays.asList(c1));
        order.setProducts(l1);

        order1.setProducts(l2);
        order1.setCustomer(Arrays.asList(c2));

        order1.setCustomer(Arrays.asList(c3));
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
    public static void t(){
         String FLAG = "dflaskjf; klcqwjer9qieiqucwepirom9028905839045809ds8gf[90g8sd[fh8f-[gh8-09wer0=t]mxcvnmz.xvchku9erpiot789-348tipahjrgfkhzxvxmb,mncxmh6t3q90485ut9rsqklgfjkj#Q$YTEWOPJGPOEDSJC)$%#@^*@$%690uiodrj;lstj3;wpiot8ujdfpgioja90-8-0cx8v#KL%J,,.345.3.l0-0----0000-00---0-----0..-.-.--.....--.-.-.----5345..9.........4.....3.........456...4.........3.....2.........7.....3424.......................564...544......4...5.8...9.....6...3.7.........79345.9.565.....1...1.3...7.....1...1.33452.......................013..89345......4......9......732......8........6......8........9......9........846..78654......................698............8...3............6.....098345.....73............6...6............186...........................79843..9879878....6.......7.......8.......5.......8.......6.......9.......9.....12387.....7............................786982..........8........45623..77833...........9...............109841....................345.....723....5...1...6...2...6...3....5......78234.....45....1...8...7...8...2...3....873....4...5...........................4.....7..........1...5............9.4...93459......1...............1...............1............................4.....3..345634..3...7...3........7.5....3455......1.....3.........2.....867843....1............................5321452............1...............1...............1....743745.....1...............1............................2345754..5.....44........6.....354335....3.....13........4.....42........7542345................4....2...533....52...3.....6....2.3..9.....98...1..7.6.....6....7...88.....5....6....9...964....................------0--0-=0-=-0-00000000-00-0-0-000000,0,,0000jasdkl;jferiotupvn23c014985901c79840p72x812m598723189057m2190857mx98012479812798m1407395813479857m2149857198x0579814320758937981982347384957983g";
       String s= "";
        for(int i= 0 ; i<FLAG.length(); i++){
            if(Character.isUpperCase(FLAG.charAt(i))) s+=FLAG.charAt(i);
        }
        System.out.println("Hello World");
        System.out.println(s);
    }


}
