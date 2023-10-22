public class Tuple <X, Y> {
    private final X x;
    private final Y y;

    public Tuple(X x, Y y){
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }
    public Y getY() {
        return y;
    }

    public void showType(){
        System.out.println("Type of X is " + x. getClass().getName() + " and Value of x is :  " + x );
        System.out.println("Type of Y is " + y. getClass().getName() + " and Value of y is :  " + y );
    }

}