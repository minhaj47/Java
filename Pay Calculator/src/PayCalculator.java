public abstract class PayCalculator {
    // private static final double HOURLY_RATE = 70;
    // private static final double FIXED_RATE = 550;

    public abstract double getPay(Client client/* , String method*/);
    // { 
    //     return switch(method){
    //         case "HOURLY" -> client.getHoursWorked()*HOURLY_RATE;
    //         case "FIXED" -> FIXED_RATE;
    //         default -> throw new IllegalArgumentException("Unknown method: " + method);
    //     };  
    // }
}
