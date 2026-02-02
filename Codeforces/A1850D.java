import java.util.*;
public class A1850D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                }
            Arrays.sort(arr);
            int temp=0,max=0;
            for(int i=0;i<n-1;i++){
                if(arr[i+1]-arr[i]<=k){
                    temp++;
                    if(temp>max){
                        max=temp;
                        }
                    }else{
                    temp=0;
                    }
                }
            System.out.println(n-(max+1));
            }
        }
    }