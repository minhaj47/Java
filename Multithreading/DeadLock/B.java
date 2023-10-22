package DeadLock;

public class B {
    synchronized void bar(A a){
        System.out.println("Inside b.bar , Thread :" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Trying to call a.last");
        a.last();
    }

    synchronized public void last() {
        System.out.println("Inside b.last: Thread : " + Thread.currentThread().getName());
    }
}
