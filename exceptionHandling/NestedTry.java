package exceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 43/a;
            System.out.println("a =" + a);

            try{
                if(a==1){ a = a/(a-a); }
                if(a==2){
                    int [] c = {1};
                    c[4] = 4;
                }
            } catch (ArithmeticException e) {
                System.out.println("Handled: " + e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
}
// inner can get access to outer but outer can't access to inner catch
//
//        minhaj@minhaj-IdeaPad-3-15ITL6:~/Desktop/dev/java$ javac exceptionHandling/NestedTry.java
//
//        minhaj@minhaj-IdeaPad-3-15ITL6:~/Desktop/dev/java$ java exceptionHandling.NestedTry
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at exceptionHandling.NestedTry.main(NestedTry.java:7)
//
//        minhaj@minhaj-IdeaPad-3-15ITL6:~/Desktop/dev/java$ java exceptionHandling.NestedTry fdklj
//        a =1
//        Handled: java.lang.ArithmeticException: / by zero
//
//        minhaj@minhaj-IdeaPad-3-15ITL6:~/Desktop/dev/java$ java exceptionHandling.NestedTry fdklj dufd
//        a =2
//        Handled: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1
