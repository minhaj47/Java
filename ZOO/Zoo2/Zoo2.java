package ZOO.Zoo2;

public class Zoo2 {
    private Animal[] animals;

    public Zoo2(Animal[] animals){
        this.animals = animals;
    }

    public void printInfo(){
        for(Animal animal: animals){
            System.out.println(animal.toString());
        }
    }
}
