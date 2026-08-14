import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String oct = sc.next();
        
        int dec = Integer.parseInt(oct, 8);
        System.out.println("Equivalent binary number: " + Integer.toBinaryString(dec));
    }
}
