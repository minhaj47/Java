package code.Interface;

interface A{
    int a=10;
    void am();
}
interface B extends A{
    static int b=30;
    int c=50;
    interface C{
        final static int a=40;
        void bm();
        void am();
    }
    abstract void bm();
}

class TestB implements B, B.C{   // C not visible until called by its outer class
    int x=10; private int p=0;

    public static void main(String[] args) {
        TestB t=new TestB();
        t.s();
        t.am();
        A a = t;
        B b = t;
        C c = t;

        a.am();b.am();b.bm();c.bm();

    }
    public  class D{
        D(){
            int y=80;
            x=30;
            System.out.println("X is : "+ x +" and y: "+ y);
        }
        public void s(){
            System.out.println("x is :"+x+" p = "+p);
        }
    }
    public void am(){
        System.out.println("Am: "+c);

    }
    public void bm(){
        System.out.println("BM: "+ C.a);  // a is ambiguous one a = 10 in interface A and one in interface B.C must be specified
    }
    void s(){
        x=10;
        int y=20;
        System.out.println("x is : "+x+" and y is "+y);
        D d=new D();
        d.s();
    }
}
