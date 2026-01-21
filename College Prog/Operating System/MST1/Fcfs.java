import java.util.Scanner;

class Fcfs {
    
    // Method to swap elements at index i and j in array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("Enter number of processes: ");
        int n = Sc.nextInt();

        int[] at = new int[n];  // Arrival Time
        int[] bt = new int[n];  // Burst Time
        int[] ct = new int[n];  // Completion Time
        int[] tat = new int[n]; // Turnaround Time
        int[] wt = new int[n];  // Waiting Time
        int[] order = new int[n]; // Process IDs
        int[] pid = new int[n]; // Process

        // Input Arrival Times and Burst Times
        for (int i = 0; i < n; i++) {
            order[i] = i+1; // Assign order to implement
            pid[i] = i+1; // Assign process ID
            System.out.print("Enter Arrival Time for P[" + (i + 1) + "]: ");
            at[i] = Sc.nextInt();
            System.out.print("Enter Burst Time for P[" + (i + 1) + "]: ");
            bt[i] = Sc.nextInt();
        }

        // Sort processes by Arrival Time (AT), then by PID if ATs are the same
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (at[j] > at[j + 1] || (at[j] == at[j + 1] && order[j] > order[j + 1])) {
                    swap(at, j, j+1);   // Swap AT                 
                    swap(bt, j, j+1);   // Swap BT
                    swap(pid, j, j+1);  // Swap PID
                    swap(order, j, j+1);// Swap order
                }
            }
        }

        // Calculate Completion Time (CT)
        ct[0] = at[0] + bt[0]; // First process
        for (int i = 1; i < n; i++) {
            if (at[i] > ct[i - 1]) {
                ct[i] = at[i] + bt[i]; // CPU is idle
            } else {
                ct[i] = ct[i - 1] + bt[i];
            }
        }

        // Calculate Turnaround Time (TAT) and Waiting Time (WT)
        int totalTAT = 0, totalWT = 0;
        for (int i = 0; i < n; i++) {
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
            totalTAT += tat[i];
            totalWT += wt[i];
        }

        // Sort by PID to ensure output is in ascending order of process IDs
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pid[j] > pid[j + 1]) {
                    swap(at, j, j+1);   // Swap AT                 
                    swap(bt, j, j+1);   // Swap BT
                    swap(ct, j, j+1);   // Swap CT
                    swap(tat, j, j+1);  // Swap TAT
                    swap(wt, j, j+1);   // Swap WT
                    swap(pid, j, j+1);  // Swap PID
                    swap(order, j, j+1);// Swap order
                }
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
