interface MinMax<T extends Comparable<T>>{  /// T in comparable is not parameter it is argument
    T min();
    T max();
}

class MyClass <T extends Comparable<T>> implements MinMax<T>{  // Possible to make Myclass non GENric
    T[] values;
    public MyClass(T [] values){
        this.values = values;
    }

    @Override
    public T min() {
        T mn = values[0];
        for(int i=1; i<values.length; i++){
            if(values[i].compareTo(mn) < 0)
                mn = values[i];
        }
        return mn;
    }

    @Override
    public T max() {
        T mn = values[0];
        for(int i=1; i<values.length; i++){
            if(values[i].compareTo(mn) > 0)
                mn = values[i];
        }
        return mn;
    }

}
public class GenInterfaceDemo {
    public static void main(String[] args) {
        Integer [] a = {2, 4, 2, 5, 6, 3};
        MyClass<Integer> myClass = new MyClass<>(a);
        System.out.println(myClass.min());
        System.out.println(myClass.max());
    }
}
