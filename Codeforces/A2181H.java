import java.util.*;

public class A2181H {
    static List<Long> divisors(long x) {
            List<Long> ds = new ArrayList<>();
            for (long i = 1; i * i <= x; i++) {
                if (x % i == 0) {
                    ds.add(i);
                    if (i * i != x) ds.add(x / i);
                }
            }
            return ds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();

        List<Long> divW = divisors(w);
        List<Long> divH = divisors(h);

        for (long a : divW) {
            if (n % a != 0) continue;
            long m = n / a;

            for (long b : divH) {
                if (m % b != 0) continue;
                long c = m / b;

                if (c > 0 && d % c == 0) {
                    long wc = a - 1;
                    long hc = b - 1;
                    long dc = c - 1;
                    System.out.println(wc + " " + hc + " " + dc);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}