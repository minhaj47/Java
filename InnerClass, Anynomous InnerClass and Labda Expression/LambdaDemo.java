public class LambdaDemo {
    public static void main(String[] args) {
        // normal way
        C c = new C();
        c.show();

//        //using lambda
//        B b = ()->{
//                System.out.println("Ahlan sahlan");
//        };
//        b.show();

        //interface implementation
        X x = ()-> System.out.println("Allahu akbar");
        x.show();
    }
}