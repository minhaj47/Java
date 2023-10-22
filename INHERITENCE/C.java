package INHERITENCE;

class C extends B{

    C(int i,int k){
        super(200,100);
        
        this.k=k;
        this.i=i;
        System.out.println("Inside c()");
    }
    void m(){
        System.out.println("Inside c(m2) i="+i+",k="+k);
    }
    // void m2(){
    //     System.out.println("Inside c(m2) i="+i+",k="+k);
    // }
    
}