import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String oct = sc.next();
        
        System.out.println("Equivalent decimal number: " + Integer.parseInt(oct, 8));
    }
}
