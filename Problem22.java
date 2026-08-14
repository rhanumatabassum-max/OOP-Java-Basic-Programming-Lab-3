import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String bin = sc.next();
        
        System.out.println("Decimal Number: " + Integer.parseInt(bin, 2));
    }
}
