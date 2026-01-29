import java.util.*;
public class A1555A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long slices=Math.max(6, (n%2==0?n:n+1));
            System.out.println(slices*5/2);
        }
    }
}
