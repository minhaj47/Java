interface StringFunc{
    String func(String s);
}
interface GenericFuncInf<T>{
    T func(T s);
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

public class LambdaDemo {
    public static String strOp(StringFunc f,  String s){
        return f.func(s);
    }
    public static <T> T GenOp(GenericFuncInf<T> f,  T s){
        return f.func(s);
    }

    public static void main(String[] args){
        String inStr = "Lambda Expression";
        StringFunc reverse = (s) ->{
            String ans = "";
            for(int i= s.length()-1; i>=0; i--){
                ans+=s.charAt(i);
            }
            return ans;
        };
        System.out.println(reverse.func(inStr));

        // Generic 
        String inStr1 = "1Lambda Expression1";
        StringFunc reverse1 = (s) ->{
            String ans = "";
            for(int i= s.length()-1; i>=0; i--){
                ans+=s.charAt(i);
            }
            return ans;
        };
        System.out.println(reverse1.func(inStr1));

        // As argument

        String iStr2 = "2LAmbda Expression2";
        String oStr2 = strOp((s)->{
            String ans = "";
            for(int i= s.length()-1; i>= 0; i--){
                ans += s.charAt(i);
            }
            return ans;
        }, iStr2);
        System.out.println(oStr2);

        // As argument //Generic 

        String iStr3 = "3LAmbda Expression3";
        String oStr3 =  GenOp((s)->{  
            String ans = "";
            for(int i= s.length()-1; i>= 0; i--){
                ans += s.charAt(i);
            }
            return ans;
        }, iStr3);
        System.out.println(oStr3);

    // method reference
        String in = "alupotol";
        String out = strOp(Myclass::reverse, in);
        System.out.println(out);
    }
}