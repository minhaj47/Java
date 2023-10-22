public class Student{
    private final String name;
    private final double[] marks;

    public Student(String name, double[] marks){
        this.name = name;
        this.marks = marks;
    }
    public double total(){
        double total = 0.0;
        for(int i=0; i<marks.length; i++){
            total+=marks[i];
        }
        return total;
    }
    public double average(){
        return total()/marks.length;
    }
    
}