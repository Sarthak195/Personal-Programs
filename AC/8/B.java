//Write a function to print the sum of all odd numbers from 1 to n.
public class B {
    public static void sum(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            if (n%2==0){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        sum(100);
        }
    }
