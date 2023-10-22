import java.util.Arrays;
import java.util.StringJoiner;

public class DynamicArray<T> {
    private static final int CAPACITY = 5;

    private T[] elements;
    private int size;

    public int getSize() {
        return size;
    }

    public DynamicArray(){
        elements = (T[]) new Object[CAPACITY]; // down casting 
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public void add(T item){
        if(size == elements.length){
            grow();
        }
        elements[size++] = item;
    }

    private void grow(){
        int newCapacity = 2 * elements.length;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    
    public T get(int index){
        try {
            if(index < 0 || index >= size ){
            throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index invalid");
            e.printStackTrace();
            return null;
        }
        return elements[index];
    }

    @Override 
    public String toString(){
        StringJoiner joiner = new StringJoiner(", ");
        for(int i=0; i<size; i++){
            joiner.add(String.valueOf(elements[i]));
        }
        return joiner.toString();
    }
}
