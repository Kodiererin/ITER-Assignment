#include <stdio.h>

#ifdef _WIN32
#include <windows.h>
#else
#include <unistd.h>
#endif

int main() {
#ifdef _WIN32
    // Windows-specific code
    printf("Windows does not have getpid() and getppid() equivalents.\n");
#else
    // Unix-like system code
    printf("Process Id = %ld\n", (long)getpid());
    printf("Parent Process Id = %ld\n", (long)getppid());
#endif

    char ch = getchar();
    return 0;
}
