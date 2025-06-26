import java.util.*;

class WildcardDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Integer sum is: " + sum(list1));

        List<Double> list2 = Arrays.asList(1.23, 23.2, 4.2, 3.5, 5.55);
        System.out.println("Double sum is: " + String.format("%.2f", sum(list2))); // Format to 2 decimal places
    }

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
