import java.util.Scanner;
public class A584A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n==1 && m==10){
            System.out.println(-1);
            sc.close();
            return;
        }
        System.out.print(m);
        while(n-->1){
            System.out.print("0");
        }
        sc.close();
    }   
    
}
