import java.util.*;

public class A158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int cutoff = a[k - 1], count = 0;
        for (int x : a) if (x >= cutoff && x > 0) count++;

        System.out.println(count);
    }
}
