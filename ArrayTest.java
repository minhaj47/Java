public class ArrayTest {
    public static void main(String[] args){
        int [] a1;
        a1 = new int[5];
        int[] a2 = new int [5];
        int[] a3 = {1, 2, 3, 4, 5} ;
        for(int i=0; i<a1.length; i++){
            System.out.println(a1[i]);
        }
        for(int i=0; i<a2.length; i++){
            System.out.println(a2[i]);
        }
        for(int i=0; i<a3.length; i++){
            System.out.println(a3[i]);
        }
        for(int i: a1){
            System.out.println(i);
        }
        for(int i: a3){
            System.out.println(i);
        }
        double [][] d= new double [5][5];
        System.out.println(Math.random());
    }
}
