public class Q {
    int n;
    boolean valueSet = false;
    synchronized int get(){
        if(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("Got : " + n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        if(valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Put : " + n);
        this.n = n;
        valueSet = true;
        notify();

    }

}
