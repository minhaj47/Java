import java.util.Arrays;
import java.util.StringJoiner;

public class CharStack {
    private char[] elements;
    private int count;

    public CharStack(){
        elements = new char[10];
    } 

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == elements.length;
    }

    public void grow(){
        int newCapacity = 2*elements.length;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void push(char c){
        if(isFull()){
            grow();
        }
        elements[count++] = c;
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return '@';
        }
        return elements[count--];
    }

    public void printElements(){
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for(int i=0; i<count; i++){
            joiner.add(Character.toString(elements[i]));
            //joiner.add(String.valueOf(elements[i]));
        }
        System.out.println(joiner);
    }
}
