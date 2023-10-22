interface NeumericFunc<T>{
    T func(T [] t) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Given Array is Empty");
    }
}
public class LamdaAndExceptions {
    public static void main(String[] args){
        Integer[] values = {1, 3, 4, 5};        
        Double[] dvalues = {1.3, 3.3, 4.3, 5.3};

        NeumericFunc<Integer> average = (v) ->{
            int sum =0;
            if(v.length == 0){
                throw new EmptyArrayException();
            }
            for(int i= 0; i<v.length; i++){
                sum+=v[i];
            }
            return sum/v.length;
        };
        NeumericFunc<Double> dAverage = (v) ->{
            Double sum =0.0;
            if(v.length == 0){
                throw new EmptyArrayException();
            }
            for(int i= 0; i<v.length; i++){
                sum+=v[i];
            }
            return sum/v.length;
        };
        try {
            System.out.println(average.func(values));
            System.out.println(average.func(new Integer[0]));
            System.out.println(dAverage.func(dvalues));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
