package java.nestedClass;

public class VarArgTest {
    void m(){
        System.out.println("From m()");
    }
    void m(int a){
        System.out.println("From m(int a)");
    }
    void m(int a, int ... b){
        System.out.println("From m(int a, int ... b)");
    }
//    void m(int a, int ... b, int c){
//        System.out.println("From m(int a, int ... b)");
//    }
    void m(float a, int ... b){
        System.out.println("From m(float a, int ... b)");
    }
    void m(int ... a){
        System.out.println("From m(int ... a)");
    }

    public static void main(String[] args){
        VarArgTest v = new VarArgTest();
        int[] a = new int[10] ;
        v.m(1, a);
        v.m();
        v.m(1);
        // v.m(1,2);
        // v.m(1,2, 3);
        v.m(1.2f,2, 3);
        
    }
}
