import java.util.Scanner;

public class celciusToFarenhait {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double cel = input.nextDouble();
        double far = cel*9/5 +32;
        System.out.println(cel + " celcius = " + far + " farenfeit.");
    }
}
