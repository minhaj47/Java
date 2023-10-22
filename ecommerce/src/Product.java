public abstract class Product {
    private final String name;
    private final int price;
    private final int discount;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public Product(String name, int price, int discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public abstract double calculatePrice();

    @Override
    public String toString(){
        return "\nProduct:"+ getName() +
                " ----price = " + getPrice();
    }

}
