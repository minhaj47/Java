package alupotol;

abstract class A1 {
    A1(int a) {
        System.out.println("A(int)");
    }

    A1() {
        System.out.println("A()");
    }

    abstract void x();

    void y() {
        System.out.println("A.y()");
        x();
    }
}

class B1 extends A1 {
    void x() {
        System.out.println("B.x()");
    }

    void y() {
        System.out.println("B.y()");
    }

    void z() {
        System.out.println("B.z()");
        super.y();
        y();
    }
}

class TestDemo {
    public static void main(String[] args) {
        B1 b = new B1();
        b.z();
    }
}
