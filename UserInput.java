import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a Number: ");
        int a = input.nextInt();
        System.out.println("Enter a Number: ");
        int b = input.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        double divide = (double)a/b;
        
        System.out.println("Sum = "+ sum);
        System.out.println("Substruction = "+ sub);
        System.out.println("Multiplication = "+ mul);
        System.out.println("Divition = "+ divide);
        
    }
}