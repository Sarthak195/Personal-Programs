//  Write a function for call by value to find sum of two numbers
#include <stdio.h>
int addNumbers(int a, int b);
int main() {
    int num1, num2, sum;
    printf("Enter first and second number: ");
    scanf("%d %d", &num1, &num2);
    sum = addNumbers(num1, num2);
    printf("Sum: %d\n", sum);
    return 0; }
    int addNumbers(int a, int b) {
    return a + b; }
