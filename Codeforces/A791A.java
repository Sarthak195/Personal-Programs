import java.util.Scanner; 
public class A791A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= Math.min(a, b); i++) {
            if (a>b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
