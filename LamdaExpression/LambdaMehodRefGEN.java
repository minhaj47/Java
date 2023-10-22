interface GenFunc<T>{
    int func(T [] ts, T t);
}
class Myclass{  // My class's object could not be Generics if i use it's static method
    static <T>int countMatching(T[] ts, T t){
        int cnt =0;
        for(int i=0; i<ts.length; i++){
            if(t == ts[i])cnt++;
        }
        return cnt;
    }
}
class MyclassGEN<T>{                   // generic class instead of generic method 
    int countMatching(T[] ts, T t){
        int cnt =0;
        for(int i=0; i<ts.length; i++){
            if(t == ts[i])cnt++;
        }
        return cnt;
    }
}

public class LambdaMehodRefGEN {
    static <T>int funcCall(GenFunc<T> f, T [] ts, T t){
        return f.func(ts, t);
    }
    // public static void main(String[] args){
    //     Integer[] values = {1, 4, 5, 3, 2, 3, 5, 3, 3, 5};
    //     int ans = funcCall(Myclass::countMatching, values, 5);
    //     System.out.println(ans);
    // }
    public static void main(String[] args){
        Integer[] values = {1, 4, 5, 3, 2, 3, 5, 3, 3, 5};
        MyclassGEN<Integer> mc = new MyclassGEN();
        int ans = funcCall(mc::countMatching, values, 5);
        System.out.println(ans);
    }
}
