interface Inf{
    Myclass classGenarator(int a);
}

class Myclass{
    int val =0;
    public Myclass(int a){
        val = a;
    }
    public int getValue(){
        return val;
    }
    
}

public class ConstructorRefANdGenerics {
    public static void main(String[] args){
        Inf inf = Myclass:: new;
        Myclass mc = inf.classGenarator(455);
        System.out.println(mc.getValue());
    }
    
}
