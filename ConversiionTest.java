public class ConversiionTest {
    public static void main(String[] args){
        System.out.println("Widening Conversion");
        byte bt = 127; //narrowing (int to byte ) as literal it allows 
        short sh = bt;  // widening 
        int i = sh; // widening 
        System.out.println("short: "+ sh + "\tByte: "+ bt);
        System.out.println("int: "+ i + "\tShort: "+ sh);
        System.out.println("Narrowing Conversion");
        i = 32769; 
        sh = (short)i;  // casting needed 
        bt = (byte)sh;  // variable can take bigger value and compilar don't know the value whether within range or not during compile time 
        System.out.println("short: "+ sh + "\tByte: "+ bt);
        bt = (byte)-129;
        System.out.println("byte: "+ bt);
        sh = (byte)-32769;
        System.out.println("Short: "+ sh);
        //boolean bl  = (boolean)1; compilation error 
        System.out.println("byte: "+ bt + "\tShort: "+ sh);

        byte p = 127, q = 127;
        int r = p*q;
        //byte b = r; // will not allow 

        System.out.println(r);

        for(byte b = 100; b<200; b++){
        System.out.println("b: "+ b);
        }
    }

}
