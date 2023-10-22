import java.util.ArrayList;
class ShoppingCart {
    private ArrayList<Product>products = new ArrayList<>();
    
    public void addProduct(Product product){
        products.add(product);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Product product : products){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString(){
        return "ShoppingCart: \n"+
                "Products: " + products;
    }
}
