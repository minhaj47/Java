import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence: ");
        
        int capacity = 10;
        int size = 0;
        int[] arr = new int[capacity];
        
        while(true){
            int element = input.nextInt();
            if(element == -1){
                System.out.println("Exit!!");
                break;
            }
            if(arr.length == size){
                int newCapacity = arr.length * 2;
                arr = Arrays.copyOf(arr, newCapacity);
            }

            arr[size++] = element;
        }
        if(size < arr.length){
            arr = Arrays.copyOfRange(arr, 0, size);
        }

        System.out.println("You Entered : ");
        System.out.println(Arrays.toString(arr));
        input.close();
    }
}
