import java.util.*;

public class A1875A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int c = sc.nextInt();

            long temp = 0;

            for (int i = 0; i < c; i++) {
                long x = sc.nextLong();
                if (x >= a) {
                    x = a - 1;
                }
                temp += x;
            }

            System.out.println(temp + b);
        }
    }
}
