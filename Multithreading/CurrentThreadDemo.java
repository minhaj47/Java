public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Current Thread");
        t.setPriority(10);
        System.out.println("new name: " + t.getName());
        System.out.println("new priority : " + t.getPriority());
        for(int n = 5; n>=0; n--){
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }

    }
}
