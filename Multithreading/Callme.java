public class Callme {
    synchronized void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        System.out.println("]");
    }

}
