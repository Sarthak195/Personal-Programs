import java.util.Scanner;
public class A580A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            System.out.println("1");
            return;
        }
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int temp=1,max=1;
        for(int i=0;i<a-1;i++){
            if(arr[i+1]>=arr[i]){
                temp++;
            }else{
                max=Math.max(max,temp);
                temp=1;
            }
        }
        max=Math.max(max,temp);
        System.out.println(max);
    }
    
}
