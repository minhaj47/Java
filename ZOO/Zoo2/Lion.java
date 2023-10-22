package ZOO.Zoo2;

public class Lion extends Animal{
    public Lion(){
        super(0, "Lion");
    }

    @Override
    public String getDiet(){
        return "meat";
    }
}
