import java.util.*;
public class Functions {
    public static void print(String name) {
        System.out.println("Your name is "+name);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.next();
        print(name);
    }
    
}
