import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.StringJoiner;

public class GenericStack<T>{
    private static final int CAPACITY = 10;

    private T[] elements;
    private int top=0;

    public int getSize() {
        return top;
    }

    public GenericStack(){
        elements = (T[]) new Object[CAPACITY]; // down casting 
    }

    public boolean isEmpty(){
        return top == 0;
    }
    
    public void push(T item){
        if(top == elements.length){
            grow();
        }
        elements[top++] = item;
    }
    public T pop(){
        try{
            if(isEmpty()){
                throw new EmptyStackException();
            } 
        } catch(EmptyStackException e){
            System.out.println("Stack is Empty");
            e.printStackTrace();
            return null;
        }
        return elements[--top];
    }

    private void grow(){
        int newCapacity = 2 * elements.length;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override 
    public String toString(){
        StringJoiner joiner = new StringJoiner(", ");
        for(int i=0; i<top; i++){
            joiner.add(String.valueOf(elements[i]));
        }
        return joiner.toString();
    }
}