class Gen1<T>{
    T t;
    Gen1(){
        T t1;
        //t = new T(); // can not be instantiate
    }
}
class Wrong<T>{
    //static T obj; static member cannot use type parameter
//    static T meth(){
//        return obj;
//    }
}
class Gen2<T extends Number>{     // Array can be made only using wildcard argument
    T [] nums;
    Gen2(T obj, T[] nums){
        this.nums = nums;
        //this.nums = new T[24]; // can not be instantiate
    }
}

public class GenRestrictions {
    public static void main(String[] args){
        Integer[] a = {2, 4, 2, 5, 6, 3};
        Gen2<Integer> g = new Gen2<>(4, a);
        //Gen2<Integer>[] g = new Gen2<Integer>[45];
        // creating array of Genrics class while specifying type is not possible
        Gen2<?>[] alupotol = new Gen2<?>[5];     // allowed

        Double dOb = 3.3;
        Integer iOb = 4;
        dOb = dOb + iOb;
        System.out.println(dOb);
        byte b = (byte) 129;
        System.out.println(b);
    }
    public static int main(String args){

        return 0;
    }
}
