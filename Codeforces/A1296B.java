import java.util.Scanner;

public class A1296B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long s = sc.nextLong();
            long ans = s + (s - 1) / 9;
            System.out.println(ans);
        }
    }
}
