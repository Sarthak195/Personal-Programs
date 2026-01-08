import java.util.*;

public class A339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        List<Character> nums = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c != '+') nums.add(c);
        }

        Collections.sort(nums);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.size(); i++) {
            if (i > 0) result.append('+');
            result.append(nums.get(i));
        }

        System.out.println(result.toString());
    }
}
