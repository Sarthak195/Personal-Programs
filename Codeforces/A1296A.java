import java.util.Scanner;

public class A1296A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int odd = 0, even = 0;

            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                if ((x & 1) == 1) odd++;
                else even++;
            }

            if (even == n) {
                System.out.println("NO");
            } else {
                if (n % 2 == 0 && odd == n)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }

        sc.close();
    }
}
