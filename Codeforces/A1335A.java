import java.util.Scanner;
public class A1335A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a= sc.nextInt();
            if(a%2==1)
                System.out.println(a/ 2);
            else
            System.out.println(a/ 2 - 1);
        }
        sc.close();
    }
}