import java.util.ArrayList;

public class HrManager {
    private ArrayList<Client>clients = new ArrayList<>();
    private PayCalculator payCalculator;
    //private PayCalculator payCalculator = new HourlyPayCalculator(20);

    public HrManager(PayCalculator payCalculator){
        this.payCalculator = payCalculator;
    }

    public void AddClient(Client client){
        clients.add(client);
    }

    public double getTotalPay(){
        double totalPay = 0.0;
        for(Client client : clients){
            totalPay+=payCalculator.getPay(client);
        }
        return totalPay;
    }

}
