import java.util.Scanner;

public class Sum {
    public static void print(int a, int b){
        int sum =a+b;
        System.out.println("Your Sum is 5"+sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        print(a,b);
       
    }
    
}
