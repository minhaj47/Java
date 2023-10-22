package code.ProtectedOutsidePackage.p3;

import code.ProtectedOutsidePackage.p3.p1.*;
import code.ProtectedOutsidePackage.p3.p2.*;

public class SubSub extends Subclass{
    public static void main(String[] args) {
        A a = new A();
//        Subclass subclass = new Subclass();
//        System.out.println(subclass.num);
        SubSub subSub = new SubSub();
        System.out.println(subSub.num);
    }
}
