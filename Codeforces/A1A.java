import java.util.Scanner;

public class A1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long tilesN = (n + a - 1) / a;
        long tilesM = (m + a - 1) / a;

        System.out.println(tilesN * tilesM);
    }
}
