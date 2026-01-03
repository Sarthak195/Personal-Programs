import java.util.Scanner;
public class A282A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n=0;
        String[] str= new String[a];
        for (int i = 0; i < a; i++) {
            str[i] = scanner.next();
        }
        for (String s : str) {
            if (s.contains("++")) {
                n++;
            } else {
                n--;
        }
    }
    System.out.println(n);
}
}