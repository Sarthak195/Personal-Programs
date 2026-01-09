import java.util.*;
public class A1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0;
        for (int i = 0; i < n; i++) {
            k+=sc.nextInt();  
            }
            if(k>0){
                System.out.println("HARD");
            }else{
                System.out.println("EASY");
            }
    }
    
    
}
