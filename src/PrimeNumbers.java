public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        for (int i = 0; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number <= 1) {
            return false;
        }

        // Check for factors from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }

        return true;
    }
}