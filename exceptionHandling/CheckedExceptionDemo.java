package exceptionHandling;


// checked exception means compiler will check whether it is handled or not \

public class CheckedExceptionDemo {
    static void m() throws IllegalAccessException{ // though it is surrounded with try catch it is needed to
                                    // add throws because it throws the checked exc again in the catch block
        try {
            throw new IllegalAccessException(); // checked exception must be handled using try catch or
                                               // throw to caller to handle the exception
                                              //  by adding throws in the method signature
        } catch(IllegalAccessException iae){
            System.out.println("m() CAtch Checked Exception Handled : " + iae);
            throw iae;  // it is thrown again(handling is not totally done)
                       // hence throws must be added to signature
        }
    }
    static void n() throws IllegalAccessException{
        throw new IllegalAccessException();
    }
    public static void main(String[] args) throws IllegalAccessException { // this throws is for last n();
        try{
            m();
            n();
        } catch(IllegalAccessException iae){
            System.out.println("Main Catch : Checked Exception Handled : " + iae);
        }
        n();                           // this is not handled in try catch Hence it will be thown to
                                      // jvm default handler and for that throws must be added to method signature
    }
}
