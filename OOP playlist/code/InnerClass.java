package code;

public class InnerClass {
    static class Cls{  // must be static to make object of it
        static int age;
        static int b = 1;
        String name;

        public Cls(String name, int age){
                this.name = name;
                this.age = age;
        }
    }

    public static void main(String[] args) {
        Cls cls = new Cls("alu potol", 55);
        Cls cls1 = new Cls("alu potol piyaj", 25);

        System.out.println(cls.name);
        System.out.println(cls1.name);
        System.out.println(cls.age);
        System.out.println(cls1.age);

    }
}
class Cls1{  // external class can not be static
    int a;
    static int b = 1;
}