import java.util.Scanner;

class Sjf {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = Sc.nextInt();

        int[] at = new int[n];  // Arrival Time
        int[] bt = new int[n];  // Burst Time
        int[] ct = new int[n];  // Completion Time
        int[] tat = new int[n]; // Turnaround Time
        int[] wt = new int[n];  // Waiting Time
        int[] pid = new int[n]; // Process IDs
        boolean[] completed = new boolean[n]; // If process is complete 

        // Input Details
        for (int i = 0; i < n; i++) {
            pid[i] = i + 1; 
            System.out.print("Enter Arrival Time for P[" + (i + 1) + "]: ");
            at[i] = Sc.nextInt();
            System.out.print("Enter Burst Time for P[" + (i + 1) + "]: ");
            bt[i] = Sc.nextInt();
        }

        int currTime = 0, completedCount = 0;
        int totalTAT = 0, totalWT = 0;

        // Process scheduling loop
        while (completedCount < n) {
            int sj = -1;
            int minBT = Integer.MAX_VALUE;

            // Find the process with the shortest burst time that has arrived
            for (int i = 0; i < n; i++) {
                if (!completed[i] && at[i] <= currTime) { // Process must have arrived
                    if (bt[i] < minBT || (bt[i] == minBT && at[i] < at[sj])) {
                        minBT = bt[i];
                        sj = i;
                    }
                }
            }

            if (sj == -1) {
                // No available process, move time forward
                currTime++;
            } else {
                // Process selected for execution
                ct[sj] = currTime + bt[sj]; // Completion time
                tat[sj] = ct[sj] - at[sj]; // Turnaround time
                wt[sj] = tat[sj] - bt[sj]; // Waiting time

                totalTAT += tat[sj];
                totalWT += wt[sj];

                completed[sj] = true; // Mark process as completed
                completedCount++; // Increase completed process count
                currTime = ct[sj]; // Move current time forward
            }
        }

        // Print Process Table
        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println("P[" + pid[i] + "]\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        // Print Averages
        System.out.printf("\nAverage Turnaround Time: %.2f\n", (float) totalTAT / n);
        System.out.printf("Average Waiting Time: %.2f\n", (float) totalWT / n);

        Sc.close();
    }
}
