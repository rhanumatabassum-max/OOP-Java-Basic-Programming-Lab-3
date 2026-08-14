import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String bin = sc.next();
        
        int dec = Integer.parseInt(bin, 2);
        System.out.println("HexaDecimal value: " + Integer.toHexString(dec).toUpperCase());
    }
}
