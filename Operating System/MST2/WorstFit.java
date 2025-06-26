public class WorstFit {
    static void WorstFit(int b_size[], int m, int p_size[], int n) {
    int allocate[] = new int[n];
    for (int i = 0; i < allocate.length; i++) allocate[i] = -1;
    for (int i = 0; i < n; i++) {
    int wstIdx = -1;
    for (int j = 0; j < m; j++) {
    if (b_size[j] >= p_size[i]) {
    if (wstIdx == -1 || b_size[wstIdx] < b_size[j]) wstIdx = j;
    }
    }
    if (wstIdx != -1) {
    allocate[i] = wstIdx;
    b_size[wstIdx] -= p_size[i];
    }
    }
    System.out.println("\nProcess Number \tProcess Size\tBlock Number");
    for (int i = 0; i < n; i++) {
    System.out.print(" " + (i + 1) + "\t\t" + p_size[i] + "\t\t");
    if (allocate[i] != -1) System.out.print(allocate[i] + 1);
    else System.out.print("Not Allocated");
    System.out.println();
    }
    }
    public static void main(String[] args) {
    int b_Size[] = {100, 500, 200, 800, 600};
    int p_Size[] = {22, 577, 312, 126};
    int m = b_Size.length;
    int n = p_Size.length;
    WorstFit(b_Size, m, p_Size, n);
    }
    }
    