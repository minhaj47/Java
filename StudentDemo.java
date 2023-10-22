public class StudentDemo {
    public static void main(String[] args){
        Student minhaj = new Student("minhaj", new double[]{
            80, 85.5, 88, 84.324, 90, 95
        });
        double total = minhaj.total();
        //double average = minhaj.average();

        System.out.println("Total Marks: "+ total);
        System.out.println("Average Marks: "+ minhaj.average());

    }
}
