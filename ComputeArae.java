import java.util.Scanner;

public class ComputeArae {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radious of a circle: ");
        double r = input.nextDouble();
        double area = r*r * 3.1416;

        System.out.println("Area: "+ area);
    }
}
