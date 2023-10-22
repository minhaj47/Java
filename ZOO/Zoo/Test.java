package ZOO.Zoo;

import ZOO.Zoo1.*;

public class Test {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        //cat.jinumsequence();

        Dog dog = new Dog();
        dog.makeSound();
        Cow cow = new Cow();
        cow.makeSound();
        cow.sleep();   // protected 
        /// cow.jinumsequence(); // default

    }
}
