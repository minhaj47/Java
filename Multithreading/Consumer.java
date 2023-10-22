public class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q = q;
        t = new Thread(this, "consumer");
    }
    public void run(){
        while(true){
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            q.get();
        }
    }
}
