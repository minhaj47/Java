public class DigitalProduct extends Product{
    private String coupon;

    public DigitalProduct(String name, int price, int discount, String coupon){
        super(name, price, discount);
        this.coupon = coupon;
    }
    public DigitalProduct(String name, int price, int discount){
        super(name, price, discount);
    }

    @Override
    public double calculatePrice(){

        int discount = switch(coupon != null ? coupon : ""){
            case "JAVA25" -> 3;
            case "JAVA2NDED" -> 5;
            default -> 0;
        };
        discount += getDiscount();

        return getPrice()*(100-discount)/100;
    }
    public double price(){
        return 1000000000;
    }
}
