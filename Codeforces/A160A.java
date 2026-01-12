import java.util.Arrays;
import java.util.Scanner;

public class A160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int x : arr) sum += x;

        Arrays.sort(arr);

        int temp = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            temp += arr[i];
            count++;
            if (temp > sum / 2) break;
        }

        System.out.println(count);
    }
}
