package alupotol;

public class ScopeExam {
        int x;

    public static void main(String args[]) {
        int x = 10;
        System.out.println("x is: " + x);

        for (x = 0; x < 3; x++) {
        int y = -1;
        byte a = 1;
        y = a;
        System.out.println("x is: " + x + " and y is: " + y);
        y = 100;
        System.out.println("x is: " + x + " and y is: " + y);
        }

        x = 20;
        int y = 50;
        System.out.println("x is: " + x + " and y is: " + y);

        ScopeExam scm = new ScopeExam();
        scm.show();
    }

    class AnotherScope {
        // int y = 8000;

        AnotherScope() {
            int y = 8000;
            x = 3000;
            System.out.println("x is: " + x + " and y is: " + y);
        }
    }

    void show() {
        x = 1000;
        int y = 2000;
        System.out.println("x is: " + x + " and y is: " + y);

        new AnotherScope();
    }
}