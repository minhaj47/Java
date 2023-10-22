class Gen<T> {
    T t;
    public Gen(T t){
        this.t = t;
    }
    T getobject(){
        return t;
    }
    public void showType(){
        System.out.println(t.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<>(88);
        System.out.println(g.getobject());
        g.showType();
    }
}
