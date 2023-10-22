package code.ProtectedOutsidePackage.p3.p2;

import code.ProtectedOutsidePackage.p3.p1.A;

public class Subclass extends A {
    public static void main(String[] args) {
        A a = new A();
        //int num = a.num;
        Subclass sclass = new Subclass();
        int num2 = sclass.num;
        System.out.println(num2);
    }
}
