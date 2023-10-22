package ZOO.Zoo2;

public class Zoo2Demo {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        animals[0]= new Lion();
        animals[1]= new Deer();
        animals[2]= new Snack();

        Zoo2 zoo2 = new Zoo2(animals);
        zoo2.printInfo();
    }
}
