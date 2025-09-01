//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        double circumference = calculateCircumference(radius);
        System.out.printf("The circumference of the circle is: %.2f" , circumference);
    }
    public static double calculateCircumference(int radius) {
        return 2 * Math.PI * radius;
    
}
}
