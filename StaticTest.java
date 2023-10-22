public class StaticTest {

    StaticTest(){
        System.out.println("From StaticTest.constructor");
    }
    static {
        System.out.println("From StaticTest.block1");
    }
    {
        System.out.println("From StaticTest.Nblock1");
    }
    static int a = 10;///initialized just at first time
    int b = 20; 
    static void m(){
        System.out.println("From StaticTest.m = "+ a);
    }
    static {
        System.out.println("From StaticTest.block2");
    }
    {
        System.out.println("From StaticTest.Nblock2");
    }
    public static void main(String[] args){
        System.out.println("From StaticTest.main");
        //m();
        StaticTest st = new StaticTest();
        StaticTest st2 = new StaticTest();
        m();
        st.m();
        st2.m();

        a=50;
        st.a+=10;

        m();
        st.m();
        st2.m();

        StaticTest st3 = new StaticTest();
        st3.m();
    }
}
class StaticTestMain {
    public static void main(String[] args){
        System.out.println("From StaticTestMain.main");
        //m();
        StaticTest st = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest.m();
        st.m();
        st2.m();

        StaticTest.a=50;
        st2.a+=10;

        StaticTest.m();
        st.m();
        st2.m();

        StaticTest st3 = new StaticTest();
        st3.m();
    }
}
