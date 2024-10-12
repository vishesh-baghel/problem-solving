import java.math.BigInteger;

public class ForLoopTimeCalculator {

    public static void main(String[] args) {
        int power = 10;
        BigInteger iterations = BigInteger.TEN.pow(power);
        System.out.println(iterations);

        System.out.println("Time taken to complete 10^" + power + " iterations is: " + runLoop(iterations) / 1_000_000_000.0 + " seconds");
    }

    private static long runLoop(BigInteger iterations) {
        long startTime = System.nanoTime();
        for (BigInteger i = BigInteger.ZERO; i.compareTo(iterations) < 0; i = i.add(BigInteger.ONE)) {
            long dummy = i.longValue() * 2;
        }
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }
}