package alupotol;
//
//public class OpExam {
//
//    public static void main(String[] args) {
//        int a = 317, b = 65, c = 177;
//        a = --b + c++;
//
//        System.out.println("1) " + ++a + " " + b + " " + c);
//        b = 19;
//        a = 21;
//        System.out.println("2) " + (a ^ b));
//        System.out.println("3) " + (~b));
//        byte i = 5;
//
//        a = i << 3;
//        System.out.println("4) " + a);
//        i = -1;
//        a = i >> 5;
//        System.out.println("5) " + a);
//        a = i >> 28;
//        System.out.println("6) " + a);
//        a = 87;
//        a %= 8;
//        System.out.println("7) " + a);
//
//        boolean d = true, e = false;
//        d |= e;
//        System.out.println("8) " + d);
//        d &= e;
//        System.out.println("9) " + d);
//        System.out.println("10) " + ((a % 4 == 0 && e) ? "Close" : "End"));
//    }
//}
abstract class A {
    abstract void show();

    void showToo() {
        System.out.println("1000");
    }

}

class B extends A {
    void show() {
        System.out.println("4000");
    }

    void showToo() {
        System.out.println("3000");
    }

    void showAlso() {
        System.out.println("7000");
    }
}

class C extends B {
    void show() {
        System.out.println("6000");
    }
    void showToo() {
        System.out.println("2000");
    }

    void showAlso() {
        System.out.println("5000");
    }
}

public class OopExam2{
    public static void main(String[] args) {
        B b=new B();
        A a =b;

        a.show();
        a.showToo();
        b.showAlso();
        b = new C();
        b.show();
        b.showToo();
        b.showAlso();
    }
}