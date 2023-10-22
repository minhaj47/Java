package ZOO.Zoo1;

public class DogDemo {
    public static void main(String args[]){
        Dog dog1 = new Dog();
        Dog dog2 = new Poodle();
        Dog dog3 = new Bulldog();

        DogWalkarDownCasting dogWalkar = new DogWalkarDownCasting();

        dogWalkar.walk(dog1);
        dogWalkar.walk(dog2);
        dogWalkar.walk(dog3);

    }
    
}

/*
user@pc:~/Desktop/dev/java/ZOO/Zoo1$ cd ..
user@pc:~/Desktop/dev/java/ZOO$ javac -d . Zoo1/Bulldog.java 
user@pc:~/Desktop/dev/java/ZOO$ javac -d . Zoo1/DogWalkar.java 
user@pc:~/Desktop/dev/java/ZOO$ javac -d . Zoo1/DogDemo.java 
user@pc:~/Desktop/dev/java/ZOO$ java ZOO.Zoo1.DogDemo 
walking UNKNOWN!
walking POODLE!
walking BullDog!
 */