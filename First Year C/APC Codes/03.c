// Program to change the value of constant integer using pointers.
#include <stdio.h>
int main() {
    const int var = 10;
    const int *ptr = &var;
    printf("Before changing, constant number: %d\n", var);
    int *ptr2 = (int *)ptr;
    *ptr2 = 20;
    printf("After modification, constant number: %d\n", var);
    return 0; }
