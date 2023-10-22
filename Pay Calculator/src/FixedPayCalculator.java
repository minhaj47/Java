public class FixedPayCalculator extends PayCalculator{
    private final double FIXED_RATE;
    
    public FixedPayCalculator(double FIXED_RATE){
        this.FIXED_RATE = FIXED_RATE;
    }
    @Override
    public double getPay(Client client){
        return FIXED_RATE;
    }
}
