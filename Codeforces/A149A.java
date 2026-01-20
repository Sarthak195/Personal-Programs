import java.util.*;

public class A149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        if (k == 0) {
            System.out.println(0);
            return;
        }

        int[] mon = new int[12];
        for (int i = 0; i < 12; i++) {
            mon[i] = sc.nextInt();
        }

        Arrays.sort(mon);

        int sum = 0;
        for (int i = 11; i >= 0; i--) {
            sum += mon[i];
            if (sum >= k) {
                System.out.println(12 - i);
                return;
            }
        }

        System.out.println(-1);
    }
}
