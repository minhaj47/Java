
public class VariableTest {
    public static void main(String[] args){
        byte bt =100;
        short sh = 12345;
        int i = 1234567;
        long l = 123456789123456L;
        float f = 12345.12345F;
        double d = 123456789.123456789;
        char c = 'A';
        boolean bl = true;
        
        System.out.println("Byte = "+bt);
        System.out.println("Short = " + sh);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char  = " + c);
        System.out.println("Boolean = " + bl);

        System.out.println("\nNeumeric Max and Min Range\n");
        System.out.println("Byte: MAX = "+ Byte.MAX_VALUE);
        System.out.println("Byte: MIN = "+ Byte.MIN_VALUE);
        System.out.println("Short: MAX = " + Short.MAX_VALUE);
        System.out.println("Short: MIN = " + Short.MIN_VALUE);
        System.out.println("Integer: MAX = " + Integer.MAX_VALUE);
        System.out.println("Integer: MIN = " + Integer.MIN_VALUE);
        System.out.println("Long: MAX = " + Long.MAX_VALUE );
        System.out.println("Long: MIN = " + Long.MIN_VALUE );
        System.out.println("float: MAX = " + Float.MAX_VALUE);
        System.out.println("float: MIN = " + Float.MAX_VALUE);
        System.out.println("double: MAX = " + Double.MAX_VALUE);
        System.out.println("double: MAX = " + Double.MAX_VALUE);
        System.out.println("char: MAX = " + Character.MAX_VALUE);
        System.out.println("char: MIN = " + Character.MIN_VALUE);

    }
}