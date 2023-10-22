package ZOO.Zoo1;

public class DogWalkarDownCasting {
    // public void walk(Dog dog){
    //     System.out.println("walking "+ dog.getBread());
    // }
    public void walk(Dog dog){
        if(dog instanceof Poodle){
            Poodle poodle = (Poodle)dog;
            System.out.println("walking "+ poodle.getname());
        }
        else 
            System.out.println("walking "+ dog.getBread());
    }
}
