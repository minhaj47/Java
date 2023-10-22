package DeadLock;

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();
    Thread t;
    public Deadlock(){
        Thread.currentThread().setName("mAIN tHREAD");
        t = new Thread(this, "Racing THread");
    }

    @Override
    public void run() {
        b.bar(a);
        //System.out.println(Thread.currentThread().getName());
    }
    void deadlockStart(){
        t.start();
        a.foo(b);
        //System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        deadlock.deadlockStart();
    }

}
