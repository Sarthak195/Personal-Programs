// Program to print a string using pointer.
#include <stdio.h>
int main() {
    char str[100];
    char *ptr;
    printf("Enter your string: ");
    scanf("%s",str);
    ptr=str;
    while(*ptr!='\0') {
        printf("%c",*ptr);
        ptr++; }
        return 0;  }