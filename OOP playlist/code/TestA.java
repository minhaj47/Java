package code;

public class TestA {
    public static void main(String[] args) {
        R r=new R(50,60,70);
        r.pm();
        r.d();
        P p=r;
        p.d();
        p.pm();
        p.p=300;
        r.d();
        Q q=r;
        q.p = 200;
        q.d();
        r.d();
    }
}

abstract class P{
    int p=10;
    P(int p){
        System.out.println("Const: P="+p);

    }
    void pm(){
        System.out.println("PM: "+p);
    }
    abstract void d();
}
class Q extends P{
    int q=20;
    Q(int p,int q){
        super(p);
        this.q=q;
        System.out.println("Const: q="+q);
    }
    void  d(){
        p++;
        System.out.println("QD: "+p);
    }

}
class R extends Q{
    int p=30;
    int r=40;
    R(int p,int q,int r){
        super(p,q);
        this.r=r;
        System.out.println("Const: R="+r);
    }
    void  d(){
        p--;
        System.out.println("RD: "+p);
    }

}