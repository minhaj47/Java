import java.util.UUID;

public class Customer {
    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long number, int cvv, String validThrough){
        this.name = name;
        this.creditCard = new CreditCard(number, cvv, validThrough);
    }

    public Customer(String name, CreditCard creditCard){
        this.name = name;
        this.creditCard = creditCard;
    }
    private Transaction makePayment(ShoppingCart cart){
        return new Transaction(UUID.randomUUID(), cart.getTotalPrice());
    }
    public Order checkout(ShoppingCart cart){
        Transaction transaction = makePayment(cart);

        return new Order(this, cart, transaction);
    }

    @Override 
    public String toString(){
        return "Customer : " + name ;
    }
    
}
