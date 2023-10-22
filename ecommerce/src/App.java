public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();
        Dimension dimension = new Dimension(12, 10, 2);

        NonDigitalProduct keyboard = new NonDigitalProduct("mechanical keyboard", 2100, 5, 15, dimension);
        NonDigitalProduct mouse = new NonDigitalProduct("a4tech", 600, 7, 25, dimension);
        NonDigitalProduct ecoDot = new NonDigitalProduct("Eco 4th gen", 200, 5, 55, dimension);
        
        DigitalProduct javaEbook = new DigitalProduct("java 2nd edition", 200, 15);
        DigitalProduct AdvanceJavaEbook = new DigitalProduct("Advance Java", 100, 5);

        System.out.println(javaEbook.price()); 
        
        cart.addProduct(ecoDot);
        cart.addProduct(keyboard);
        cart.addProduct(mouse);
        cart.addProduct(javaEbook);
        cart.addProduct(AdvanceJavaEbook);

        System.out.println(cart);
        double totalPrice = cart.getTotalPrice();
        System.out.println("Total Price: " + totalPrice);

        Customer customer = new Customer("Miftahul haque",  2020331047, 196, "05/24");
        Order order = customer.checkout(cart);
        System.out.println(order);
    }
}
