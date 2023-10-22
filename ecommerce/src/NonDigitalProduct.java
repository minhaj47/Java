public class NonDigitalProduct extends Product{
    private static final int SHIPPING_RATE = 5;
    private static final double DIMENSION_CHARGE = 1.5;

    private final int weight;
    private final Dimension dimension;


    public NonDigitalProduct(String name, int price, int discount, int weight, Dimension dimension){
        super(name, price, discount);
        this.weight = weight;
        this.dimension = dimension;
    }

    public double calculatePrice(){
        double price = getPrice() * (100 - getDiscount())/100;
        price += SHIPPING_RATE * weight;

        if(dimension.getVolume() > 10){
            price += dimension.getVolume() * DIMENSION_CHARGE;
        }
        return price;
    }
}
