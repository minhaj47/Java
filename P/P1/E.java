package P.P1;

public class E {
    private String name = "E";
    
    public void print(){
        System.out.println("Inside E");
        // System.out.println("a = " + a);
        // System.out.println("d = "+ d);
        System.out.println("Name = "+ name);
    }
    public static void main(String[] args){
        E e = new E();
        e.print();
        
        B b = new B();
        b.print();         // pubic
        b.a =10000;       // default
        b.d = 10000.5;   //protected 
        b.name = "dkjfd";  //private 
        
    }
}
