public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIN(T t, V[] v){
         for(int i=0; i<v.length; i++){
             if(t.equals(v[i]))return true;
         }
         return false;
    }
    public static void main(String[] args) {
        Integer [] a = {2, 4, 2, 5, 6, 3};
        System.out.println( isIN(4, a));
        System.out.println(GenericMethodDemo.<Integer, Integer>isIN(4, a));  // can be specified if needed
        System.out.println( isIN(10, a));
    }
}
