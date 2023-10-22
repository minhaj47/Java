package INHERITENCE;

public class A {
    int i;
    private int j;
    A(int i, int j){
        System.out.println("Inside A()");
        this.i= i;
        this.j = j;
    }
    void m(){
        System.out.println("Inside A.m() i =" + i + " , j = "  + j);
    }
    public void m1(){
        System.out.println("Inside A.m1() i =" + i + " , j = "  + j);
    }
    public void m3(){
        System.out.println("Inside A.m1() i =" + i );
    }
}
