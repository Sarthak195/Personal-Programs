// Write a program to print a 2*2 matrix. 
#include <stdio.h>
int main() {
    int matrix[2][2] = {{1, 2}, {3, 4}};
    printf("Matrix:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            printf("%d\t", matrix[i][j]); }
        printf("\n"); }
    return 0; }
