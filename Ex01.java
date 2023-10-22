//import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        int n = args.length;
        System.out.println(n);
        for(int i=0; i<n; i++ ){ 
            
        }
        System.out.println(" ");
        int sum =0;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i=0; i<n; i++ ){ 
            int x = Integer.parseInt(args[i]);
            System.out.print(x + " ");
            if(mx<x)mx=x;
            if(mn>x)mn=x;
            sum+=x;
        }
        System.out.println("\nSum ="+sum);
        System.out.println("avg ="+(double)sum/n);
        System.out.println("Max = "+ mx);
        System.out.println("Min = "+ mn);
        System.out.print("Separated Positive: ");
        for(int i=0; i<n; i++ ){ 
            int x = Integer.parseInt(args[i]);
            if(x>0) System.out.print(x + " ");
        }
        System.out.print("\nSeparated Negative: ");
        for(int i=0; i<n; i++ ){ 
            int x = Integer.parseInt(args[i]);
            if(x<0) System.out.print(x + " ");
        }
        System.out.print("\nSeparated ODD: ");
        for(int i=0; i<n; i++ ){ 
            int x = Integer.parseInt(args[i]);
            if(x%2==1) System.out.print(x + " ");
        }
        System.out.print("\nSeparated EVEN: ");
        for(int i=0; i<n; i++ ){ 
            int x = Integer.parseInt(args[i]);
            if(x%2==0) System.out.print(x + " ");
        }
        System.out.println("");
    }
}
