import java.math.BigInteger;

public class fibonacci100 {
    public static void main(String[] args) {
        int count = 100;
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ": " + first);

            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
    }
}