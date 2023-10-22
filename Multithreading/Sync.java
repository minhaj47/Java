public class Sync {
    public static void main(String[] args) {
        Callme c = new Callme();
        Caller c1 = new Caller(c, "Hello");
        Caller c2 = new Caller(c, "Synchronized");
        Caller c3 = new Caller(c, "World");
        c1.t.start();
        c2.t.start();
        c3.t.start();
        //c1.t.start();
    }
}
