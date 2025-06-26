import java.util.*;

public class FIFOPageReplacement {
    public static int pageFaults(int pages[], int n, int capacity) {
        Set<Integer> set = new HashSet<>();
        Queue<Integer> indexes = new LinkedList<>();
        int page_faults = 0;

        for(int i = 0; i < n; i++) {
            if(set.size() < capacity) {
                if(!set.contains(pages[i])) {
                    set.add(pages[i]);
                    indexes.add(pages[i]);
                    page_faults++;
                }
            } else {
                if(!set.contains(pages[i])) {
                    int val = indexes.poll();
                    set.remove(val);
                    set.add(pages[i]);
                    indexes.add(pages[i]);
                    page_faults++;
                }
            }
        }
        return page_faults;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pages: ");
        int n = sc.nextInt();

        int[] pages = new int[n];
        System.out.print("Enter the page reference sequence: ");
        for(int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        System.out.print("Enter memory capacity: ");
        int capacity = sc.nextInt();

        int result = pageFaults(pages, n, capacity);
        System.out.println("Total page faults: " + result);

        sc.close();
    }
}
