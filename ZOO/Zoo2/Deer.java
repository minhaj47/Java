package ZOO.Zoo2;

public class Deer extends Animal{
    public Deer(){
        super(4, "Deer");
    }

    @Override
    public String getDiet(){
        return "grass";
    }
}
