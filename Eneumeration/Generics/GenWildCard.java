class Stats<T> {
    T[] arr;

    Stats(T[] arr) {
        this.arr = arr;
    }
}

public class GenWildCard {
    static boolean isavg(Stats<? extends Number> obj) {
        System.out.println(obj.getClass().getName());
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr = { 1 };
        Character[] crr = { 'a' };
        Stats<Integer> a = new Stats<>(arr);
        Stats<Character> c = new Stats<>(crr);
        isavg(a);
        isavg(c);
    }
}
