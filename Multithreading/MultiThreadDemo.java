public class MultiThreadDemo {
    public static void main(String[] args) {
        System.out.println("MultiThread Started");
        Thread t1 = new newThreadRunnable().t;
        Thread t2 = new NewThreadExtends();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MultiThread Ended");
    }
}
