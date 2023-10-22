public class NumberSystemConversion {
    public static void main(String[] args){
        int number = 1_000_000;
        String s = Integer.toString(number);
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String Hex = Integer.toHexString(number);
        System.out.println("String : "+ s);
        System.out.println("Binary : "+ binary);
        System.out.println("Hex : " + Hex);
        System.out.println("octal : "+ octal);
    }
}
