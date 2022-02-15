package commercial;

public class Product {

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Product(long id, String name, String category,double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        Category = category;
    }

    private Long id;
    private String name;
    private double price;
    private String Category;
}
