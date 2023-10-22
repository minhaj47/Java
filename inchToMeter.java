import java.util.Scanner;

public class inchToMeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in Inch: ");
        double inch = input.nextDouble();
        double meter = inch*.0254;
        System.out.println(inch + " inch is "+ meter + " meter");

    }
}
