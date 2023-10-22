interface SMO{
    int func(int i);
}

public class VarCap {
    public static void main(String[] args){
        int x = 10;
        SMO s = (i) ->{
            int v = x + 10;
            //x++;  // illigal 
            return v;
        }; 
        //x++;  // illigal 
        System.out.println(s.func(x));
    }
    
}
