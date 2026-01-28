import java.util.Scanner;

public class A313A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println(n);
            return;
        }

        int removeLast = n / 10;
        int removeSecondLast = (n / 100) * 10 + (n % 10);

        System.out.println(Math.max(removeLast, removeSecondLast));
    }
}
