public class CashPayment implements Payment{
    double amount;
    public CashPayment(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        System.out.println("Taking Cash Payment");
        return amount;
    }
}