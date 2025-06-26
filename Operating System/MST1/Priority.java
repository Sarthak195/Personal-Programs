import java.util.Scanner;

class Priority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        
        int[] at = new int[n];
        int[] bt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];
        int[] priority = new int[n];
        int[] rank = new int[n];
        
        for (int i = 0; i < n; i++) {
            rank[i] = i + 1;
            
            System.out.print("Enter Arrival Time for P[" + (i + 1) + "]: ");
            at[i] = sc.nextInt();
            while (at[i] < 0) {
                System.out.print("Invalid input! Arrival Time cannot be negative. Enter again: ");
                at[i] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Burst Time for P[" + (i + 1) + "]: ");
            bt[i] = sc.nextInt();
            while (bt[i] <= 0) {
                System.out.print("Invalid input! Burst Time must be greater than zero. Enter again: ");
                bt[i] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Priority for P[" + (i + 1) + "]: ");
            priority[i] = sc.nextInt();
        }
        
        // Sorting based on priority and arrival time
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (priority[j] > priority[j + 1] || (priority[j] == priority[j + 1] && at[j] > at[j + 1])) {
                    int temp = priority[j];
                    priority[j] = priority[j + 1];
                    priority[j + 1] = temp;
                    
                    temp = at[j];
                    at[j] = at[j + 1];
                    at[j + 1] = temp;
                    
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;
                    
                    temp = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = temp;
                }
            }
        }
        
        // Compute Completion Time (CT)
        ct[0] = at[0] + bt[0];
        for (int i = 1; i < n; i++) {
            if (at[i] > ct[i - 1]) {
                ct[i] = at[i] + bt[i];
            } else {
                ct[i] = ct[i - 1] + bt[i];
            }
        }
        
        // Compute Turnaround Time (TAT) and Waiting Time (WT)
        int totalTAT = 0, totalWT = 0;
        for (int i = 0; i < n; i++) {
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
            totalTAT += tat[i];
            totalWT += wt[i];
        }
        
        // Print results
        System.out.println("\nProcess\tAT\tBT\tPriority\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println("P[" + rank[i] + "]\t" + at[i] + "\t" + bt[i] + "\t" + priority[i] + "\t\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }
        
        System.out.println("\nAverage Turnaround Time: " + (float) totalTAT / n);
        System.out.println("Average Waiting Time: " + (float) totalWT / n);
        
        sc.close();
    }
}
