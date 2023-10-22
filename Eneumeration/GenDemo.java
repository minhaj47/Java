class Gen<T> {
    T ob;
    Gen(T ob){
        this.ob = ob;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value of v : " + v);

        Gen<String> StrOb;
        StrOb = new Gen<>("alupotol");
        iOb.showType();
        String str = StrOb.getOb();
        System.out.println("value of str : " + str);

    }
}
