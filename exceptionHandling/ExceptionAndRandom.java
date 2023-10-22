package exceptionHandling;

import java.util.Random;

public class ExceptionAndRandom {
    public static void main(String[] args) {
        int a= 0, b = 0, c = 100;
        Random random = new Random();
        int cnt = 0, cntError = 0;
        for(int i= 0; i<5000; i++){
            try {
                cnt ++;
                a = random.nextInt()%100;
                b = random.nextInt()%100;
                c = (a/b);
                System.out.println("It will not be printed if exception occur." + a + " " + b + " c = " + c );
            }catch (ArithmeticException are){
                cntError ++;
                System.out.println("Divided By zero. Not Allowed!" + a + " " + b + " " + c);
                System.out.println(are);
                //are.printStackTrace();
            }
        }
        System.out.println(cnt);
        System.out.println(cntError);
    }
}
