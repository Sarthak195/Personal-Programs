import java.util.*;

public class A1624B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            boolean ok = false;

            // Case 1: multiply a
            long x = 2 * b - c;
            if (x > 0 && x % a == 0) ok = true;

            // Case 2: multiply b
            long y = a + c;
            if (y % (2 * b) == 0) ok = true;

            // Case 3: multiply c
            long z = 2 * b - a;
            if (z > 0 && z % c == 0) ok = true;

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
