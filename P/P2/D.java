package P.P2;

public class D extends P.P1.B{
    // int a = 50000;
    private String name = "D";
    
    public void print(){
        System.out.println("Inside D");
        // System.out.println("a = " + a);
        // System.out.println("d = "+ d);
        System.out.println("Name = "+ name);
    }
    public static void main(String[] args){
        D d = new D();
        d.print();
        d.d = 40.2;
        d.a = 42;
        
        // P.P1.B b = new P.P1.B();
        // b.print();
        // b.a =10000;
        // b.d = 10000.5;
        // b.name = "dkjfd";
        
    }
}
