import java.util.Scanner;
public class A133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(n.contains("H")||n.contains("Q")||n.contains("9")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
