package exceptionHandling;


// Unchecked exception means compiler will not check whether it is handled or not
// apart from this both exception are same

public class UncheckedExceptionDemo {
    static void m() {
        throw new ArithmeticException();
    }
    static void n() throws NullPointerException{ // no need of that
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try{
            m();
        } catch(ArithmeticException e){
            System.out.println("Main Catch : UnChecked Exception Handled : " + e);
        }
        n();  // thrown to jvm
              // handled in runtime
    }
}
