import org.w3c.dom.ls.LSOutput;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        myThread t1 = new myThread();
        t1.start();
        //Thread.sleep(1); // it will not ensure the completion of t1 hence ans will not be correct
        try {
            t1.join();  // this will pause main thread untill t1 ends
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("100000 = " + t1.x);
    }

}

class myThread extends Thread{
    int x;
    @Override
    public void run(){
        for(int i=0; i<100000; i++){
            x++;
        }
    }
}