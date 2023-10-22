public class GenMethod {
    static <V extends Comparable<V>> V minimum(V a, V b, V c) {
        V min = (a.compareTo(b) < 0) ? a : b;
        return (min.compareTo(c) < 0) ? min : c;
    }

    public static void main(String[] args) {
        System.out.println("Min : " + minimum(-3, 40, 15));
        System.out.println("Min : " + minimum(16.6, 8.8, 7.7));
        System.out.println("Min : " + minimum("guava", "mango", "apple"));
    }
}
