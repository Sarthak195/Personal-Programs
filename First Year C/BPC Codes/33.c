// Write a program to find multiplication of two matrix
#include <stdio.h>
int main() {
    int mat1[2][2], mat2[2][2], result[2][2] = {0};
    printf("Enter elements of the first matrix (2x2):\n");
    for (int i = 0; i < 2; ++i)
        for (int j = 0; j < 2; ++j)
            scanf("%d", &mat1[i][j]);
    printf("Enter elements of the second matrix (2x2):\n");
    for (int i = 0; i < 2; ++i)
        for (int j = 0; j < 2; ++j)
            scanf("%d", &mat2[i][j]);
    for (int i = 0; i < 2; ++i)
        for (int j = 0; j < 2; ++j)
            for (int k = 0; k < 2; ++k)
                result[i][j] += mat1[i][k] * mat2[k][j];
    printf("\nResultant Matrix\n");
    for (int i = 0; i < 2; ++i) {
        for (int j = 0; j < 2; ++j)
            printf("%d\t", result[i][j]);
        printf("\n"); }
    return 0; }
