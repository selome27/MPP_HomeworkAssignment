package lesson11_part1.prob3;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream {

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    private static int nextPrime(int current) {
        int next = current + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    private Supplier<Stream<Integer>> primesSupplier =
            () -> Stream.iterate(2, PrimeStream::nextPrime);
    public void printFirstNPrimes(long n) {
        primesSupplier.get()
                .limit(n)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("First N Primes:");
        ps.printFirstNPrimes(5);
    }
}
