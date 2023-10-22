public class GenMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isln(T x, V[] y){
        for(int i=0; i<y.length; i++){
            if(x.equals(y[i]))return true;
        }
        return false;
    }
}
