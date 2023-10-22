package alupotol.p1;
public class Test1 {
    protected int a;
    int b;
    int c = 5;
    private Test1(int a){
        this.a = a;
        b = 6;
        c = 78;
    }
    public Test1(int a, int b){
        this.a = a;
        this.b = b;
    }
    void get(int a){
        System.out.println("Not Overriden");
        if (a == 5)
            throw new ArithmeticException("alu +- ");
        throw new NullPointerException("nulll ;=");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1(6);
        try{
            test1.get(55);
        }catch (ArithmeticException | NullPointerException ne){
            System.out.println("catched : " + ne);
        }
    }

}
