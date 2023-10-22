public class ThreadUsingAnynomousClass {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("An Thread is created using Anonymous class");
            }
        }, "Thread 01");

        Thread t2 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("An Thread is created using lambda Expression");
        }, "Thread 02");

        System.out.println(Thread.currentThread().getName());
        t1.start();
        t2.start();
    }
}
