import javax.swing.*;

class newThreadRunnable implements Runnable{
    Thread t;
    public newThreadRunnable(){
        t = new Thread(this , "newThreadRunnable");
        System.out.println(t);
        t.start();
    }
    @Override
    public void run() {
        for(int n = 5; n>=0; n--){
            System.out.println("Child (Runnable) : " + n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        new newThreadRunnable();
        for(int n = 5; n>=0; n--){
            System.out.println("Main: " + n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
