import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long l = input.nextLong();

        for(int i=2; i<l; i++){
            while(l%i==0){
                System.out.print(i + " ");
                l/=i;
            }
        }
        if(l>1)System.out.println(l);

        input.close();
    }
}
