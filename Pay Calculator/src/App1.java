public class App1 {
    public static void main(String[] args) {
        PayCalculator payCalculator1 = new FixedPayCalculator(550);
        PayCalculator payCalculator2 = new HourlyPayCalculator(50);
        HrManager hrManager = new HrManager(payCalculator2);
        
        Client client0 = new Client("milon", 10);
        hrManager.AddClient(client0);
        Client client1 = new Client("jihan", 20);
        hrManager.AddClient(client1);
        
        double totalPay = hrManager.getTotalPay();
        System.out.println("total Amount to be paid :" + totalPay);
    }
}
