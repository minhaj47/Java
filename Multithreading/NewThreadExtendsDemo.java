class NewThreadExtends extends Thread{
    Thread t;
    public NewThreadExtends(){
        t = new Thread(this , "newThreadExtends");
        System.out.println(t);
        t.start();
    }
    @Override
    public void run() {
        for(int n = 5; n>=0; n--){
            System.out.println("Child (EXTENDS) : " + n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class NewThreadExtendsDemo {
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
