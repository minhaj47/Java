public class OverLoadingTest {
    void test(double d){
        System.out.println("T4 double");
    }
    void test(float f){
        System.out.println("T5 float");
    }
    void test(){
        System.out.println("T1 ");
    }
    void test(byte b){
        System.out.println("T2 byte");
    }
    void test(int i){
        System.out.println("T3 int");
    }
    
    public static void main(String [] args){
        OverLoadingTest ov = new OverLoadingTest();
        byte b = 123;
        short sh = 234;
        long l = 123L;
        ov.test();
        ov.test(123);
        ov.test(b);
        ov.test(1.2);
        ov.test(sh);
        ov.test(123456789L);
        ov.test(123.123f);
        ov.test((int)123.5);
        ov.test(l);

    }
}
