public class PaymentEngineDemo {
    public static void main(String[] args)
    {
        PaymentEngine paymentEngine = new PaymentEngine();

        BkashPayment bkashPayment = new BkashPayment(500);
        paymentEngine.accept(bkashPayment);

        CashPayment cashPayment = new CashPayment(600);
        paymentEngine.accept(cashPayment);
        
    }
}
