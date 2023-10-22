package exceptionHandling;

public class ThrowDemo {

    public static void main(String[] args) {
        try{
            alu();
        } catch (Exception e) {
            System.out.println("Again Caught  exception " + e);
        }
    }

    static void alu(){
        try{
            int a = 0;
            a = a/a;
        } catch (ArithmeticException e) { // arithmeticException is unchecked acception it will not be checked by compilert
            System.out.println("Caught exception " + e);
            throw e;
        }
    }
}
