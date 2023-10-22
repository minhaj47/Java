class A<T extends Comparable<T>, V extends Comparable<V>> {
    T a;
    V b;

    A(T a, V b) {
        this.a = a;
        this.b = b;
    }

    T getVal() {
        return a;
    }

    boolean compare() {
        return a > b;
    }
}

public class Gen {
    public static void main(String[] args) {
        // A<Integer> a = new A<>(15, 20);
        // A<String> s = new A<>("A", "B");
        A<Double, Integer> d = new A<>(1231.43, 123);
    }
}
