package exceptionHandling;

public class ExcDemo {
    static void m(int d){
        try {
            int a = 42/d;
            int[] c = {1};
            c[2] = 123;
        } catch (Exception e) {
            System.out.println("Catch m()" + e);
        }
        
    }
    public static void main(String[] args){
        try{
            m(args.length);
        }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        catch(ArrayIndexOutOfBoundsException are){
                System.out.println(are);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        
    }

}
