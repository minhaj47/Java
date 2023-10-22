public class Person{
    private String name;
    public static void main(String[] args){
        Person person; // reference container
        person = new Person("Minhaj");  // memory allocation and 
        // storing memory address in person container

        System.out.println("person's name: "+ person.name);

        Person copyOfRef = changeName(person);

        System.out.println("person's name: "+ person.name);
        System.out.println("alupotol: "+ copyOfRef.name);
        
    }
    public Person(String name){
        this.name = name;
    }
    public static Person changeName(Person copyOfRef){
        copyOfRef.name = "alupotol";
        return copyOfRef;
    }

}