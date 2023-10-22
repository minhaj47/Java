package exceptionHandling;

public class ThrowsDemo{
    static void m() throws IllegalAccessException{ // thought it is surrounded with try catch it is needed to
        try {   // add throws because it throws the checked exc again in the catch block
            System.out.println("fjkdlfj");
            throw new IllegalAccessException(); // checked exception must be handled using try catch or add throws to method
        } catch(IllegalAccessException iae){
            System.out.println("m() CAtch IAE");
            throw iae;
        } 
    }
    static void n(){
        throw new NullPointerException();  // unchecked exception no metter whether handled or not
        // that means compiler will not tell anything
    }
    public static void main(String[] args){
        try{
            m();
            n();
        } catch(IllegalAccessException iae){
            System.out.println("Main CAtch IAE");
        }
        n();
    }
}
