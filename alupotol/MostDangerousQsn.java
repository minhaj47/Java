//package alupotol;
//
//interface A {
//    int i = 10;  //public static and final
//    int j = 20;
//    interface B {
//        void s(); // interface method are always public and abstract
//    }
//    void show(String msg);  // interface method are always public and abstract
//}
//
//class C implements A {
//    static int k = 30;  // k must be static to access from static nested class E
//
//    class D implements B {
//        public void s() {  // add public
//            System.out.println("i " + i + " j = " + j + " k = " + k);
//        }
//
//        public void change() {
//            int i=20; // add int
//            int j=10; // add int
//        }
//
//    }
//    //
//    static class E {
//
//        static void s() {
//            System.out.println("i " + i + " j=" + j + " " +k);  // i, j are static final public implicitly
//        }
//
//        static void s(String msg) {   // should be static to access Statically
//            System.out.println(msg);
//        }
//    }
//    public void show(String msg) {          // add public. could not assign weaker access modifier
//        System.out.println(msg + " " + k);
//    }
//    String show1(String msg) {   // collition with show so change name
//        return msg;
//    }
//    public static void main(String[] args) {
//        C c = new C();
//        c.show("Error!");
//        System.out.println(c.show1("Hello"));
//
//        D d = c.new D();  // inner class( nonstatic nested class) must be initialized using the object of outer class
//        d.s();
//        d.change();
//
//        E.s("Hello!");
//        E.s();
//    }
//}
//
//
