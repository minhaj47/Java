public class Test {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A("Thread 1");
        //System.out.println(t1.getName());
        t1.start();
        System.out.println("Inside main method : " + Thread.currentThread().getName());

        MyThread t2 = new MyThread();
        Thread t = new Thread(t2, "Thread 2");
        //System.out.println(t.getName());
        t.start();
        //System.out.println("main thread loop");
        for(int i=0; i< 10; i++){
            System.out.println(3);
            Thread.sleep(500);
        }

    }
}
class A extends Thread{  // two thread run totally parallally. sleep is for understanding purpose
    public A(String threadName){
        super(threadName);
    }
    @Override
    public void run(){
        System.out.println("Inside run method : " + Thread.currentThread().getName());
        for(int i=0; i< 10; i++){
            System.out.println(1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends B implements Runnable{  // two thread run totally parallally sleep is for understanding purpose
    @Override
    public void run(){
        for(int i=0; i< 10; i++){
            System.out.println(2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class  B{

}
