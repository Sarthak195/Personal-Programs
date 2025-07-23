//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class C {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = findGreater(a, b);
        System.out.println("The greater number is: " + greater);
   } 
   public static int findGreater(int a, int b) {
            return (a > b) ? a : b;
}}
