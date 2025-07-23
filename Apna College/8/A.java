//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class A {
    public static void sum(int a ,int b ,int c) {
        System.out.println("Sum is "+(a+b+c));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Values->");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        sum(a,b,c);
    }
}
