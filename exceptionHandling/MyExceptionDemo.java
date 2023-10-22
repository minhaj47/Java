package exceptionHandling;

public class MyExceptionDemo {
    public static void main(String[] args){
        /// throw new MyException();  // checked exception 
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
