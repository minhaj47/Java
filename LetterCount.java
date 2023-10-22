import java.util.Scanner;
import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        s = s.toLowerCase();
        char[] inputValue = s.toCharArray();

        System.out.println(Arrays.toString(inputValue));

        int[] count = new int[256];

        for(int i=0; i<inputValue.length; i++){
            char letter = inputValue[i];
            if(Character.isLetter(letter)){
                count[letter]++;     // though char is used as index it has taken it's ascii value.
            }                        // and so array size must be larger than ascii value;
        }
        System.out.println("Letter Count:");
        for(char c = 'a'; c<='z'; c++){
            if(count[c]!=0){
                System.out.println(c + " : "+ count[c]);
            }
        }
        System.out.println(count['a']);
        input.close();
    }
}
