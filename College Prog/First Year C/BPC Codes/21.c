// Write a program to print number in word in between 1-5. Like (1 =one) 
#include <stdio.h>
int main() {
    int num;
    printf("Enter a number between 1 and 5: ");
    scanf("%d", &num);
    switch (num) {
        case 1:printf("One");
        break;
        case 2:printf("Two");
        break;
        case 3:printf("Three");
        break;
        case 4:printf("Four");
        break;
        case 5:printf("Five");
        break;
        default:printf("Number out of range");
        break;
    }
    return 0;
}

