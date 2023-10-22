interface A{
    int i=10;
    void m();
    static void s(){
        System.out.println("Static A.s()");
        p2(); 

    }
    default void d(){
        System.out.println("Default A.d()");
        //p();
    }
    private void p(){
        System.out.println("Private A.p()");
    }
    private static void p2(){
        System.out.println("Private static A.p2()");
    }
}
interface B extends A{
    default void d(){
        A.super.d();
        System.out.println("Default B.d()");
    }
}
public class DefaultInterface implements A, B {

    int i = 20;
    public void m(){
        System.out.println("A.m()");
    }
    // public void d(){
    //     System.out.println("Demo.d()");   // must be overriden for avoiding duplicate default method d();
    // }
    public static void main(String[] args){
        DefaultInterface a = new DefaultInterface();
        a.m(); a.d(); a.i++;
        System.out.println(a.i);
        A a2 = a;
        a2.m(); a2.d(); 
        // a2.i++; this is final and static 
        System.out.println(a2.i);

        // a.s();
        // a2.s();

        A.s();

    }
}
