package exceptionHandling;

public class Exception0 {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException ar){
            System.out.println("Not allowed to divide a number by zero");
        }
        System.out.println("alupotol");
    }
}
