public class Caller implements Runnable{
    String msg;
    Thread t;
    Callme c;

    public Caller(Callme c, String msg){
        this.c = c;
        this.msg = msg;
        t = new Thread(this);
    }

    @Override
    public void run() {
//        synchronized (c){
//            c.call(msg);
//        }
        c.call(msg);
    }
}
