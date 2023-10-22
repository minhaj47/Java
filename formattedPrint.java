public class formattedPrint {
    public static void main(String[] args){
        byte bt =100;
        short sh = 12345;
        int i = 1234567;
        long l = 123456789123456L;
        float f = 12345.12345F;
        double d = 123456789.123456789;
        char c = 'A';
        boolean bl = true;
        String s = "Hello";
        
        System.out.printf("Byte in Decimal = %d%n", bt);
        System.out.printf("Byte in octal = %o%n", bt);
        System.out.printf("Byte in hexa = %x%n", bt);
        System.out.printf("float in standard = %f%n", f);
        System.out.printf("float in scientific = %e%n", f);
        System.out.printf("float in scientific = %E%n", f);
        System.out.printf("float in Mix = %g%n", f);
        System.out.printf("double in Mix = %G%n", d);
        System.out.printf("String = %s%n", s);

        System.out.printf("|%10d|%n", i);
        System.out.printf("|%010d|%n", i);
        System.out.printf("|%+10d|%n", i);
        System.out.printf("|%+10d|%n", -i);
        System.out.printf("|%-10d|%n", i);
        System.out.printf("|%-10d|%n", -i);
        System.out.printf("|%,11d|%n", i);
        System.out.printf("|%15.3e|%n", d);
        System.out.printf("|%15.3f|%n", d);
        System.out.printf("|%15.15f|%n", d);
        System.out.printf("|%5.3e|%n", d);
        System.out.printf("|%5s|%n", s);
        System.out.printf("|%15s|%n", s);
        System.out.printf("|%-15s|%n", s);
    }
}
