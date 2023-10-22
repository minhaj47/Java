package ZOO.Zoo2;

public abstract class Animal {
    private final int legs;
    private final String name;

    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }
    
    public abstract String getDiet();

    @Override
    public String toString(){
        return name + " has " + legs + " leg(s)";
    }
}
