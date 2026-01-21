// Write a program of string functions. 
#include <stdio.h>
#include <string.h>
int main() {
    char str1[50] = "Hello, ";
    char str2[] = "world!";
    printf("String 1: %s\n", str1);
    printf("String 2: %s\n", str2);
    printf("Length of String 1: %lu\n", strlen(str1));
    char str3[50];
    strcpy(str3, str1);
    printf("Copied String: %s\n", str3);
    int cmpResult = strcmp(str1, str3);
    if (cmpResult == 0) {
        printf("String 1 and Copied String are equal.\n"); } 
        else {
        printf("String 1 and Copied String are not equal.\n"); }
    return 0; }