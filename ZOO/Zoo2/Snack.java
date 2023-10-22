package ZOO.Zoo2;

public class Snack extends Animal{
    public Snack(){
        super(0, "Snack");
    }

    @Override
    public String getDiet(){
        return "rat";
    }
}
