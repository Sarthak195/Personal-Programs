// Write a function to pass an integer array as an argument and find sum of array elements 
#include <stdio.h>
int findSum(int arr[], int size) {
    int sum = 0;
    for (int i = 0; i < size; ++i) {
        sum += arr[i]; }
    return sum; }
int main() {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int arr[size];
    printf("Enter %d elements of the array:\n", size);
    for (int i = 0; i < size; ++i) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]); }
    int sum = findSum(arr, size);
    printf("Sum of array elements: %d\n", sum);
    return 0; }
