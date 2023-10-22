public class Producer implements Runnable{
    Q q;
    Thread t;
    public Producer(Q q){
        this.q =q;
        t = new Thread(this, "producer");
    }
    @Override
    public void run() {
        int i =0;
        while(true){
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            q.put(i++);
        }
    }
}
