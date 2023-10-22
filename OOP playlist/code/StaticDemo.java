package code;

public class StaticDemo {
    public static void main(String[] args) {

        Human kunal = new Human("kunal", 22);
        Human rafi = new Human("rafi", 24);

        System.out.println(Human.population);
        Human.fun();
        kunal.greetings();

    }
}

class Human{
    String name;
    int age;
    static int population =0;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.population+=1; //Human.population
    }

    static void fun(){
        System.out.println("alu potol");
        //greetings();
        //Human.greetings();
        Human muslim = new Human("Minhaj", 23);
        muslim.greetings();
        int population1 = population;
    }
    void greetings(){
        System.out.println("Assalamu Alaikum");
        fun();
    }
}

