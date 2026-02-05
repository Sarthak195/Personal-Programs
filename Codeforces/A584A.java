import java.util.Scanner;

public class A584A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        if (t == 10 && n == 1) {
            System.out.println(-1);
            return;
        }
        if (t == 10) {
            n--;
        }
        System.out.print(t);
        while (n-- > 1) {
            System.out.print("0");
        }
        sc.close();
    }
}
