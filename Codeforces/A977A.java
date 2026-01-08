import java.util.*;
public class A977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while(m>0){
            if(n%10==0){
                n/=10;
            }else{
                n--;
            }
            m--;
        }
        System.out.println(n);
        sc.close();
        
    }
    
}
