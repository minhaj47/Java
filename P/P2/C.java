package P.P2;

public class C {

    int a =50;
    private String name = "C";
    protected double d=5.66;
    
    public void print(){
        System.out.println("Inside C");
        System.out.println("a = " + a);
        System.out.println("d = "+ d);
        System.out.println("Name = "+ name);
    }
    public static void main(String[] args){
        C c = new C();
        c.print();
        P.A a = new P.A();
        a.print();
        P.P1.B b = new P.P1.B();
        b.print();
        // b.a = 10000;
        // b.d = 10000.5;
        // b.name = "dkjfd";
    }

}
