package P.P1;

public class B {
    int a =10;
    private String name = "B";
    protected double d=5.6;
    public void print(){
        System.out.println("Inside B");
        System.out.println("a = " + a);
        System.out.println("d = "+ d);
        System.out.println("Name = "+ name);
    }
    public static void main(String[] args){
        B a = new B();
        a.print();
        P.A b = new P.A();
        b.print();
        P.P2.C c = new P.P2.C();
        c.print();
    }

}
