import java.util.ArrayList;
import java.util.Collections;

class MyValue{
    private int value;
    MyValue(int i){
        value  = i;
    }
    int getValue(){
        return value;
    }
}

public class MethodRefandCollectionFrameWork {
    public static int compareVal(MyValue a, MyValue b){
        return a.getValue()-b.getValue();
    }
    public static void main(String[] args){
        ArrayList<MyValue> al = new ArrayList<>();
        al.add(new MyValue(0));     
        al.add(new MyValue(1));
        al.add(new MyValue(2));
        al.add(new MyValue(3));
        
        MyValue mv = Collections.max(al, MethodRefandCollectionFrameWork:: compareVal);
        System.out.println(mv.getValue());

    }
}
