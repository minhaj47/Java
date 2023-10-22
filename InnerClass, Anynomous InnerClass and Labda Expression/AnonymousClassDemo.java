public class AnonymousClassDemo {
    public static void main(String[] args) {
        // normal way
        C c = new C();
        c.show();

        //using anonymous class
        B b = new B(){
            public void show(){
                System.out.println("Ahlan sahlan");
            }
        };
        b.show();

        //interface implementation
        X x = new X(){
            public void show(){
                System.out.println("Allahu akbar");
            }
        };
        x.show();
    }
}

class B {  // you cant use A here
    public void show(){
        System.out.println("Hello");
    }
}

@FunctionalInterface
interface X{   // functional interface = have SAM = have Single Abstract method
    void show();
}

class C extends B{
    @Override
    public void show(){
        System.out.println("Assalamualaikum");
    }
}