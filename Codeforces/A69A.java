import java.util.*;
public class A69A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0,j=0,k=0;
        while(t-->0){
            i+=sc.nextInt();
            j+=sc.nextInt();
            k+=sc.nextInt();
        }
        if(i==0 && j==0 && k==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
