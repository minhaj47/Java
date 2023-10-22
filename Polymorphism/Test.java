package Polymorphism;

public class Test{
    public static void main(String args[]){
        Liquid genericLiquid = new Liquid();
        Liquid milk = new Milk();
        Coffee coffee = new Coffee();

        Cup cup = new Cup();
        cup.addLiquid(genericLiquid);
        cup.addLiquid(milk);
        cup.addLiquid(coffee);
        cup.mix();
    }
}

/*
user@pc:~/Desktop/dev/java/Polymorphism$ javac -d . Liquid.java 
user@pc:~/Desktop/dev/java/Polymorphism$ javac -d . Milk.java 
user@pc:~/Desktop/dev/java/Polymorphism$ javac -d . Coffee.java 
user@pc:~/Desktop/dev/java/Polymorphism$ javac -d . Cup.java 
user@pc:~/Desktop/dev/java/Polymorphism$ javac -d . Test.java 
user@pc:~/Desktop/dev/java/Polymorphism$ java Polymorphism.Test
Swirling Liquid
Swirling Milk
Swirling Coffee
user@pc:~/Desktop/dev/java/Polymorphism$ javac Liquid.java 
user@pc:~/Desktop/dev/java/Polymorphism$ javac Milk.java
user@pc:~/Desktop/dev/java/Polymorphism$ javac Cup.java
user@pc:~/Desktop/dev/java/Polymorphism$ javac Coffee.java 
user@pc:~/Desktop/dev/java/Polymorphism$ javac Test.java
user@pc:~/Desktop/dev/java/Polymorphism$ cd ..
user@pc:~/Desktop/dev/java$ java Polymorphism.Test
Swirling Liquid
Swirling Milk
Swirling Coffee
 * 
 */
