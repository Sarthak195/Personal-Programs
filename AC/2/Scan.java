import java.util.*;
public class Scan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("hello");
        String name= sc.nextLine();
        System.out.println(name);
    }
}
}