package commercial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dao {
    private List<Product> productList = ApiMock.getProductAsList();
    private List<Order> orderList = ApiMock.getOrdersAsList();

    public List<Product> getBooksLessThanHundered() {
        //Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
        return ApiMock.getProductsByKeys("Books").stream().filter(x -> x.getPrice() < 100).collect(Collectors.toList());

    }

    public List<Order> getOrdersToys() {
        // Exercise 2 — Obtain a list of order with products belong to category “Toys”
        return ApiMock.getOrdersAsList().stream().filter(x -> x.getProducts().stream().anyMatch(y -> y.getCategory().equals("Toys"))).collect(Collectors.toList());
    }

    public List<Product> getProductList() {
        //Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");

        Stream<Order> orderStream = ApiMock.getOrdersAsList().stream().filter(x -> {
            try {
                return sdf.parse(x.getOrderDate()).before(sdf.parse("01-Frb-2021"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return false;
        });
        Optional<Order> optionalOrder = orderStream.filter(y -> y.getCustomer().stream().anyMatch(z -> z.getTier() == 2)).findAny();
        return optionalOrder.get().getProducts();
    }

}
