import java.util.Scanner;

public class radianToDouble{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in) ;

        System.out.println("Enter radian");
        double radian = input.nextDouble();
        System.out.println("Degree: "+ (radian*180/3.1416));
    }
    
}
