import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        String b1 = sc.next();
        System.out.print("Input the second binary number: ");
        String b2 = sc.next();
        
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);
        
        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(n1 * n2));
    }
}
