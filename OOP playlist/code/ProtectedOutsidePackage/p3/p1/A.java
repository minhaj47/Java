package code.ProtectedOutsidePackage.p3.p1;

import code.ProtectedOutsidePackage.p3.p2.Subclass;

public class A {
    protected  int num =5461;
    protected void show(){
        System.out.println("gelle A");
    }

    public static void main(String[] args) {
        A  a = new A();
        System.out.println(a.num);
        Subclass subclass = new Subclass();
        System.out.println(subclass.num);
    }

}
