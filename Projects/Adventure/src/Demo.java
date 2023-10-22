// Class defining a product
class Product{
    private String name;
    private double price;
    private String type = "Unknown";

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}

// Driver code
public class Demo{
    public static void main(String[] args) {
        Product product = new Product("Antivirus", 25);
        Product product1 = new Product("Java Complete Ref.", 14, "ebook");
        System.out.println(product);
        System.out.println(product1);
    }
}