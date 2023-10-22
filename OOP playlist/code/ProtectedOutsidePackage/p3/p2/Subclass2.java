package code.ProtectedOutsidePackage.p3.p2;

import code.ProtectedOutsidePackage.p3.p1.A;

public class Subclass2 extends A{
    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a.num);
//        Subclass subclass = new Subclass();
//        System.out.println(subclass.a);

        Subclass2 subclass2 = new Subclass2();
        System.out.println(subclass2.num);
    }
}