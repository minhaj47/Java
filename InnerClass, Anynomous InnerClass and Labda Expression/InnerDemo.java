//import A.B;

public class InnerDemo {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.C c = new A.C();
    }
}

class A {
    int roll ;
    String name;
    static int ID;
    class B{
        public void show(){
            System.out.println(roll);
            System.out.println(name);
        }
    }
    static class C{   /// generally not used
        public void show(){
            System.out.println(ID);
            //System.out.println(name);
        }
    }
}