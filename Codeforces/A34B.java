import java.util.Scanner;
public class A34B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;

        for(int i = 0; i < n && count < m; i++){
            if(arr[i] < 0){
                sum += -arr[i];
                count++;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}