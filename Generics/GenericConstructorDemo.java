class GenCons{
    private double value;
    public <T extends Number>GenCons(T t){
        value = t.doubleValue();
    }
    void showVal(){
        System.out.println(value);
    }
}

public class GenericConstructorDemo {
    public static void main(String[] args) {
        Integer i = 555;
        GenCons genCons = new GenCons(5555);
        genCons.showVal();
    }
}
