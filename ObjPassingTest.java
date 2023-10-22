public class ObjPassingTest {
    int a, b;
    ObjPassingTest(int i, int j){
        a=i;
        b=j;
    }
    void m(ObjPassingTest o){   // genaralized 
        o = new ObjPassingTest(100, 150);
        o.a*=2;
        o.b/=2;
    }
    void m2(){
        a*=2;
        b/=2;
    }

    public static void main(String[] args){
        ObjPassingTest ob = new ObjPassingTest(15, 20);
        ObjPassingTest ob2 = new ObjPassingTest(25, 40);
        System.out.println("ob2 Before m "+ ob2.a + " " + ob2.b);
        ob.m(ob2);
        System.out.println("ob2 After m "+ ob2.a + " "+ ob2.b);


        System.out.println("ob Before m "+ ob.a + " " + ob.b);
        ob.m(ob);
        System.out.println("ob After m "+ ob.a + " "+ ob.b);
        ob.m2();
        System.out.println("ob After m2 "+ ob.a + " " + ob.b);

    }
}
