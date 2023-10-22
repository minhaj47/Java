package exceptionHandling;

import java.util.Random;

public class ExceptionAndLoop {
    public static void main(String[] args) {
        Random r = new Random();
        int a =0;
        int b = 0;
        int c = 0;
        int cnt = 0;
        int cntError = 0;


        try{
            for(int i= 0; i<100; i++){          // this loop will break after getting a single exception
                a = r.nextInt()%10;
                b = r.nextInt()%10;
                c = 4/(a/b);
                System.out.println(a + " " + b + " " + c);
                cnt++;
            }
        }catch (Exception e1){
            System.out.println(e1);
            cntError++;
        }
//        catch (ArithmeticException e) {   // unreachable code error
//            System.out.println(a + " " + b + " " + c + " " + e);
//            cntError++;
//        }
        System.out.println(cnt + " " + cntError);
    }

}
