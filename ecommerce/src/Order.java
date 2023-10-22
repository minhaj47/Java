public class Order {

    private final Customer customer;
    private final ShoppingCart cart;
    private final Transaction transaction;

    public Order(Customer customer, ShoppingCart cart, Transaction transaction){
        this.customer = customer ;
        this.cart = cart;
        this.transaction = transaction;
    }


    public Customer getCustomer() {
        return customer;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    @Override 
    public String toString(){
        return "Order :[ " + "\n"+ customer + "\n" + cart + "\npayment:\n" + transaction + "\n ]";
    }

}