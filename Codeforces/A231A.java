import java.util.Scanner;
public class A231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mat = new int[n][3];
        int count = 0;
        for (int i = 0; i < n; i++) {
            mat[i][0] = scanner.nextInt();
            mat[i][1] = scanner.nextInt();
            mat[i][2] = scanner.nextInt();
            if (mat[i][0] + mat[i][1] + mat[i][2] >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
