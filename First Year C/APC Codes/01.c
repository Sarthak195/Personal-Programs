// Program to create, initialize, assign and access a pointer variable.
#include<stdio.h>
void main() {
    int a=10;
    int *ptr;
    ptr=&a;
    printf("%d\n",a);
    printf("%p\n",a);
    printf("%p\n",ptr);
    printf("%d\n",*ptr); }