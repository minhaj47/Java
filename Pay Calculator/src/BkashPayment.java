public class BkashPayment implements Payment {
    double amount;
    public BkashPayment(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        System.out.println("getting Bkash Payment");
        return amount;
    }
    
}
