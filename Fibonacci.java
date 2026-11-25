import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Fibonacci numbers do you want? ");
        int n = scanner.nextInt();

        BigInteger a = BigInteger.ZERO; // F(0)
        BigInteger b = BigInteger.ONE;  // F(1)

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + a);

            BigInteger next = a.add(b);
            a = b;
            b = next;
        }

        scanner.close();
    }
}
