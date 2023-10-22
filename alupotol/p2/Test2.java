package alupotol.p2;
import alupotol.p1.Test1;

public class Test2 extends Test1{
    public Test2(int a, int b) {
        super(a, b);
    }

    //@Override
    private int get(){
        System.out.println("overriden");
        return a;
    }
    public static void main(String[] args) {
        //alupotol.p1.Test1 test1= new alupotol.p1.Test1();
        Test1 test1;
    }
}
