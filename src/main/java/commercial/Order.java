package commercial;

import java.util.List;

public class Order {


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> constoconsumerss) {
        this.customer = constoconsumerss;
    }

    private long id;

    public Order(long id, String deliveryDate, String orderDate, String status) {
        this.id = id;
        this.status = status;
        this.deliveryDate = deliveryDate;
        this.orderDate = orderDate;
    }

    private String status;
    private String deliveryDate;
    private String orderDate;
    private List<Product> products;
    private List<Customer> customer;
}
