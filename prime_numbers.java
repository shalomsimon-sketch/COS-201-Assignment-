public class prime_numbers {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Prime numbers between 0 and 500:");

        for (int i = 0; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\n\nTotal primes found: " + count);
    }
}
