import java.util.function.Function;

public class BuiltInLambda {
    public static void main(String[] args){
        Function<Integer, Integer> factorial = (n)->{
            int fact = 1;
            for(int i=1; i<=n; i++){
                fact*=i;
            }
            return fact;
        };
        System.out.println(factorial.apply(5));
    }
    
    
}
