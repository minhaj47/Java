public class HourlyPayCalculator extends PayCalculator{
    private final double HOURLY_RATE;

    public HourlyPayCalculator(double HOURLY_RATE){
        this.HOURLY_RATE = HOURLY_RATE;
    }
    
    @Override
    public double getPay(Client client){
        return HOURLY_RATE*client.getHoursWorked();
    }
}
