package exceptionHandling;

public class FinallyDemo {
    static void a(){
        try{
            System.out.println("Inside a()");
            throw new RuntimeException("runntime demo1");
        }finally {
            System.out.println("a() finally");
        }
        //System.out.println("dkfjdl");  // will not accept as no catch 

    }
    static void c(){
        try{
            System.out.println("Inside c()");
            //throw new RuntimeException("runntime demo1");
            return;       // finally will be executed mustly no matter it returned or throws exception
        }finally {
            System.out.println("c() finally");
            throw new RuntimeException("runntime demo1");
        }
    }
    static void d(){
        try{
            System.out.println("Inside d()");
            throw new RuntimeException("runtime demo1");
        }catch(RuntimeException re){
            throw re;
        }
        finally {
            System.out.println("d() finally");
        }
    }

    public static void main(String[] args){
        try {
            a();
        } catch (Exception e) {
            System.out.println("Handled in Main Catch");
        }
        c();
        d();  /// it will not be executed as c() throws the exception which is handled by jvm
    }
}
