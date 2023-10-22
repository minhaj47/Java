import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an year: ");
        int year = input.nextInt();

        boolean isDivisible4 = year%4==0;
        boolean isDivisible400 = year%400==0;
        boolean isDivisible100 = year%100==0;

        boolean isLeapYear = (isDivisible4 && !isDivisible100) || isDivisible400;

        if(isLeapYear)
            System.out.println("Leap Year");
        else 
            System.out.println("Not a Leap Year");

    }
}
