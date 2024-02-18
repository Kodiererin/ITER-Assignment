#include <stdio.h>

struct Process {
    int pid;        // Process Id
    int at;         // Arrival Time
    int bt;         // Burst Time
    int rBt;        // Remaining Burst Time
    int wt;         // Waiting Time
    int rt;         // Response Time
    int ct;         // Completion Time
};

void calculateAverageMetrics(struct Process Process[], int n, float* tat, float* wt, float* rt) {
    int ttat = 0;
    int ttwt = 0;
    int ttrt = 0;

    for (int i = 0; i < n; i++) {
        tat[i] = Process[i].bt + wt[i];
        ttat += tat[i];
        ttwt += wt[i];
        ttrt += rt[i];
    }

    printf("\n");
    printf("Average Turnaround Time: %.2f\n", (float)ttat / n);
    printf("Average Waiting Time: %.2f\n", (float)ttwt / n);
    printf("Average Response Time: %.2f\n", (float)ttrt / n);
}

void printGanttChart(int startTime, int endTime, int processID) {
    for (int i = startTime; i < endTime; i++) {
        printf(" P%d ", processID);
    }
}

void FCFS(struct Process Process[], int n) {
    float tat[n];
    float wt[n];
    float rt[n];

    wt[0] = 0;
    rt[0] = 0;

    for (int i = 1; i < n; i++) {
        wt[i] = Process[i - 1].bt + wt[i - 1];
        rt[i] = wt[i];
    }

    for (int i = 0; i < n; i++) {
        tat[i] = Process[i].bt + wt[i];
    }

    printf("\nGantt Chart for FCFS:\n");

    for (int i = 0; i < n; i++) {
        printGanttChart(wt[i], wt[i] + Process[i].bt, Process[i].pid);
    }

    calculateAverageMetrics(Process, n, tat, wt, rt);
}

void RR(struct Process Process[], int n, int timeQuantum) {
    float tat[n];
    float wt[n];
    float rt[n];
    int remT[n];
    int startTime[n];

    for (int i = 0; i < n; i++) {
        remT[i] = Process[i].bt;
        wt[i] = 0;
        rt[i] = -1;
        startTime[i] = -1;
    }

    int time = 0;
    int completed = 0;

    printf("\nGantt Chart for RR:\n");

    while (completed < n) {
        for (int i = 0; i < n; i++) {
            if (remT[i] > 0) {
                if (startTime[i] == -1) {
                    startTime[i] = time;
                    rt[i] = time - Process[i].at;
                }

                int executionTime = (remT[i] > timeQuantum) ? timeQuantum : remT[i];

                printGanttChart(time, time + executionTime, Process[i].pid);

                time += executionTime;
                remT[i] -= executionTime;

                if (remT[i] == 0) {
                    completed++;
                    tat[i] = time - Process[i].at;
                    wt[i] = tat[i] - Process[i].bt;
                }
            }
        }
    }

    calculateAverageMetrics(Process, n, tat, wt, rt);
}

int main() {
    int n;
    int choice;
    int timeQuantum;

    printf("Enter the Number of Processes: ");
    scanf("%d", &n);

    struct Process Process[n];

    printf("Enter Process Details (Process ID, Arrival Time, Burst Time):\n");

    for (int i = 0; i < n; i++) {
        scanf("%d %d %d", &Process[i].pid, &Process[i].at, &Process[i].bt);
        Process[i].rBt = Process[i].bt;
    }

    printf("\nProcess Id\tArrival Time\tBurst Time\n");

    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\n", Process[i].pid, Process[i].at, Process[i].bt);
    }

    do {
        printf("\nChoose Scheduling Algorithm:\n");
        printf("1. First Come First Served (FCFS)\n");
        printf("2. Round Robin (RR)\n");
        printf("3. Exit\n");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("\nFCFS Scheduling:\n");
                FCFS(Process, n);
                break;
            case 2:
                printf("\nEnter the Time Quantum for Round Robin: ");
                scanf("%d", &timeQuantum);
                printf("\nRound Robin Scheduling:\n");
                RR(Process, n, timeQuantum);
                break;
            case 3:
                printf("\nExiting the Program\n");
                break;
            default:
                printf("\nInvalid Choice: Please enter a Valid Option\n");
                break;
        }
    } while (choice != 3);

    return 0;
}
