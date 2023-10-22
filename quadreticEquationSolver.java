import java.util.Scanner;

public class quadreticEquationSolver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double determinent = b*b - 4 * a * c;

        if(determinent>0.0){
            double root1 = (-b + Math.sqrt(determinent))/(2.0*a);
            double root2 = (-b - Math.sqrt(determinent))/(2.0*a);
            System.out.println("The roots are "+ root1 + " and "+ root2);
        }
        else if(determinent == 0.0){
            double root = (-b + Math.sqrt(determinent))/(2.0*a);
            System.out.println("root is " + root);
        }
        else System.out.println("no real root exists");
    }
}