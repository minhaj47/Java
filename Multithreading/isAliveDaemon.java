public class isAliveDaemon {
    public static void main(String[] args) throws InterruptedException {
        myThread1 t1 = new myThread1();
        t1.setDaemon(true);  //not working
        t1.start();
        System.out.println(t1.isAlive());
        System.out.println("100000 = " + t1.x);
    }
}
class myThread1 extends Thread{
    int x;
    @Override
    public void run(){
        for(int i=0; i<100000; i++){
            x++;
        }
        System.out.println("Run method exits x: " + x);
    }
}