#include <stdio.h>
#include <stdbool.h>

#define MAX_PROCESSES 5
#define MAX_RESOURCES 4

struct BankersAlgorithm {
    int max[MAX_PROCESSES][MAX_RESOURCES];
    int allocation[MAX_PROCESSES][MAX_RESOURCES];
    int need[MAX_PROCESSES][MAX_RESOURCES];

    int available[MAX_RESOURCES];
    int numOfProcesses;
    int numOfResources;
};

void initializeData(struct BankersAlgorithm *banker) {
    printf("Enter the number of processes: ");
    scanf("%d", &(banker->numOfProcesses));

    printf("Enter the number of resources: ");
    scanf("%d", &(banker->numOfResources));

    printf("Enter the Max matrix:\n");
    for (int i = 0; i < banker->numOfProcesses; i++) {
        for (int j = 0; j < banker->numOfResources; j++) {
            scanf("%d", &(banker->max[i][j]));
        }
    }

    printf("Enter the Allocation matrix:\n");
    for (int i = 0; i < banker->numOfProcesses; i++) {
        for (int j = 0; j < banker->numOfResources; j++) {
            scanf("%d", &(banker->allocation[i][j]));
        }
    }

    printf("Enter the Available resources:\n");
    for (int i = 0; i < banker->numOfResources; i++) {
        scanf("%d", &(banker->available[i]));
    }

    // Calculate the need matrix
    for (int i = 0; i < banker->numOfProcesses; i++) {
        for (int j = 0; j < banker->numOfResources; j++) {
            banker->need[i][j] = banker->max[i][j] - banker->allocation[i][j];
        }
    }
}

bool isSafeState(struct BankersAlgorithm *banker) {
    int work[MAX_RESOURCES];
    bool finish[MAX_PROCESSES];

    for (int i = 0; i < banker->numOfResources; i++) {
        work[i] = banker->available[i];
    }

    for (int i = 0; i < banker->numOfProcesses; i++) {
        finish[i] = false;
    }

    int count = 0;
    while (count < banker->numOfProcesses) {
        bool found = false;
        for (int i = 0; i < banker->numOfProcesses; i++) {
            if (!finish[i]) {
                bool canAllocate = true;
                for (int j = 0; j < banker->numOfResources; j++) {
                    if (banker->need[i][j] > work[j]) {
                        canAllocate = false;
                        break;
                    }
                }

                if (canAllocate) {
                    for (int j = 0; j < banker->numOfResources; j++) {
                        work[j] += banker->allocation[i][j];
                    }
                    finish[i] = true;
                    count++;
                    found = true;
                }
            }
        }

        if (!found) {
            break;
        }
    }

    return count == banker->numOfProcesses;
}

void resourceRequest(struct BankersAlgorithm *banker, int processNum, int request[MAX_RESOURCES]) {
    for (int i = 0; i < banker->numOfResources; i++) {
        if (request[i] > banker->available[i] || request[i] > banker->need[processNum][i]) {
            printf("Error: Invalid request. Process P%d cannot request more than needed or available.\n", processNum);
            return;
        }
    }

    for (int i = 0; i < banker->numOfResources; i++) {
        banker->available[i] -= request[i];
        banker->allocation[processNum][i] += request[i];
        banker->need[processNum][i] -= request[i];
    }

    if (!isSafeState(banker)) {
        for (int i = 0; i < banker->numOfResources; i++) {
            banker->available[i] += request[i];
            banker->allocation[processNum][i] -= request[i];
            banker->need[processNum][i] += request[i];
        }
        printf("Request denied as it leads to an unsafe state.\n");
    } else {
        printf("Request can be granted immediately.\n");
    }
}

int main() {
    struct BankersAlgorithm banker;
    initializeData(&banker);

    printf("Need Matrix:\n");
    for (int i = 0; i < banker.numOfProcesses; i++) {
        for (int j = 0; j < banker.numOfResources; j++) {
            printf("%d ", banker.need[i][j]);
        }
        printf("\n");
    }

    if (isSafeState(&banker)) {
        printf("The system is in a safe state.\n");
    } else {
        printf("The system is not in a safe state.\n");
    }

    printf("Enter the number of instances of type R2 that P3 wants to request: ");
    int requestR2;
    scanf("%d", &requestR2);

    int processNum = 2;
    int request[MAX_RESOURCES] = {0, requestR2, 0, 0};

    resourceRequest(&banker, processNum, request);

    return 0;
}
