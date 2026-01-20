import java.util.*;
public class A405A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        for(int j:b){
            System.out.println(j);
        }
        sc.close();
    }
    
}
