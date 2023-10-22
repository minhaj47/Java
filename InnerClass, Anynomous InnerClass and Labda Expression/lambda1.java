public class lambda1 {
    public static void main(String[] args) {
        Mynum m = () -> 125.5; // creates an object of Mynum and implements the method getValue and return 125.5 there
        Mynum n = new Mynum() {
            @Override
            public double getValue() {
                return 124.5;
            }
        };
        System.out.println(m.getValue());
        System.out.println(n.getValue());

        function oddEven = p ->{
            if(p%2==1)return false;
            else return true;
        };
        Func add = (int a, int b)-> a+b;

        System.out.println(oddEven.UnaryFunc(5));
        System.out.println(oddEven.UnaryFunc(10));
        System.out.println(add.binary(5, 5));
    }
}
interface Mynum{
    double getValue();
}
interface function{
    boolean UnaryFunc(int n);
}

interface Func{
    int binary(int a, int b);
}