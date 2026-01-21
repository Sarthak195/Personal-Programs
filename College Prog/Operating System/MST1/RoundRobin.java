import java.util.*;

class RoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n];  // Arrival Time
        int[] bt = new int[n];  // Burst Time
        int[] rt = new int[n];  // Remaining Time
        int[] ct = new int[n];  // Completion Time
        int[] tat = new int[n]; // Turnaround Time
        int[] wt = new int[n];  // Waiting Time
        int[] pid = new int[n]; // Process IDs

        Queue<Integer> queue = new LinkedList<>(); 
        boolean[] visited = new boolean[n]; 

        // Input Arrival Times and Burst Times
        for (int i = 0; i < n; i++) {
            pid[i] = i + 1; // Assign process ID
            System.out.print("Enter Arrival Time for P[" + (i + 1) + "]: ");
            at[i] = sc.nextInt();
            System.out.print("Enter Burst Time for P[" + (i + 1) + "]: ");
            bt[i] = sc.nextInt();
            rt[i] = bt[i]; // Initialize Remaining Time
        }

        System.out.print("Enter Time Quantum: ");
        int quantum = sc.nextInt();

        int time = 0, completed = 0;

        // Find first process to enter queue based on arrival time
        int minArrival = Integer.MAX_VALUE, firstProcess = 0;
        for (int i = 0; i < n; i++) {
            if (at[i] < minArrival) {
                minArrival = at[i];
                firstProcess = i;
            }
        }
        time = minArrival; // Start from first process arrival time
        queue.add(firstProcess);
        visited[firstProcess] = true;

        while (!queue.isEmpty()) {
            int i = queue.poll();

            if (rt[i] > quantum) {
                time += quantum;
                rt[i] -= quantum;
            } else {
                time += rt[i];
                ct[i] = time;
                tat[i] = ct[i] - at[i];
                wt[i] = Math.max(tat[i] - bt[i], 0); // Ensure waiting time is non-negative
                rt[i] = 0;
                completed++;
            }

            // Add newly arrived processes to queue
            for (int j = 0; j < n; j++) {
                if (!visited[j] && at[j] <= time && rt[j] > 0) {
                    queue.add(j);
                    visited[j] = true;
                }
            }

            // Re-add process if it's not yet completed
            if (rt[i] > 0) {
                queue.add(i);
            } else if (queue.isEmpty() && completed < n) {
                // If no process is ready, move time to next available process
                int nextArrival = Integer.MAX_VALUE;
                int nextProcess = -1;
                for (int j = 0; j < n; j++) {
                    if (!visited[j] && rt[j] > 0 && at[j] < nextArrival) {
                        nextArrival = at[j];
                        nextProcess = j;
                    }
                }
                if (nextProcess != -1) {
                    queue.add(nextProcess);
                    visited[nextProcess] = true;
                    time = nextArrival; // Move time forward to avoid CPU idle time
                }
            }
        }

        // Print Process Table
        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println("P[" + pid[i] + "]\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        // Print Averages
        float totalTAT = 0, totalWT = 0;
        for (int i = 0; i < n; i++) {
            totalTAT += tat[i];
            totalWT += wt[i];
        }
        System.out.printf("\nAverage Turnaround Time: %.2f\n", totalTAT / n);
        System.out.printf("Average Waiting Time: %.2f\n", totalWT / n);

        sc.close();
    }
}
