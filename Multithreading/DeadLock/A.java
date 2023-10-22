package DeadLock;

public class A {
    synchronized void foo(B b){
        System.out.println("Inside a.foo , Thread :" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Trying to call b.last");
        b.last();
    }
    synchronized public void last() {
        System.out.println("Inside a.last: Thread : " + Thread.currentThread().getName());
    }
}
