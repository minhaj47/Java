interface StringFunc{
    String func(String s);
}

class Myclass{
    static String reverse(String s){
        String ans = "";
        for(int i= s.length()-1; i>=0; i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
}

public class LamdaANDMethodRef {
    static String strOp(StringFunc f, String s){
        return f.func(s);
    }
    // public static void main(String[] args){
    //     String in = "alupotol";
    //     String out = strOp((s)->{
    //         String ans = "";
    //         for(int i= s.length()-1; i>=0; i--){
    //             ans+=s.charAt(i);
    //         }
    //         return ans;
    //     }, in);
    //     System.out.println(out);
    // }
    public static void main(String[] args){
        String in = "alupotol";
        String out = strOp(Myclass::reverse, in);
        System.out.println(out);
    }
    
}
