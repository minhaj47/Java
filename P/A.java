package P;

public class A {
    int a = 10;
    private String name = "A";
    protected double d = 4.5;
    public void print(){
        System.out.println("Inside A");
        System.out.println("a = " + a);
        System.out.println("d = "+ d);
        System.out.println("Name = "+ name);

    }
    public static void main(String[] args){
        A a = new A();
        a.print();
        P.P1.B b = new P.P1.B();
        b.print();
        P.P2.C c = new P.P2.C();
        c.print();
    }
}
