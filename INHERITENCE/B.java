package INHERITENCE;

public class B extends A{
    int i;
    int k;
    B(int i, int k){
        super(10, 20);
        // super.i = 50;
        // this.i = i;
        // this.k = k;
        System.out.println("Inside B()");
    }
    void m(){
        System.out.println("Inside B.m() B.i =" + i + " , A.i = "  + super.i);
    }
    public void m2(){
        System.out.println("Inside B.m2() B.i =" + i + " , k = "  + k);
        System.out.println("Inside B.m2() A.i =" + super.i + " , k = "  + k);
    }

//    public int m3(){ // cannot overload using only diffrent return type
//        System.out.println("Inside A.m1() i =" + i );
//    }
}
