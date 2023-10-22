package exceptionHandling;

public class ChainnedException {
    public static void main(String[] args) {
        try {
            demoCall();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

    }

    private static void demoCall() {
        try{
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println(e);
            e.initCause(new NullPointerException());
            throw e;
        }
    }
}
