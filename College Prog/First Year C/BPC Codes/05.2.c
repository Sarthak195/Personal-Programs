// Write a program to swap any two numbers without using third variable
#include<stdio.h>
int main() {
	int a,b;
	printf("Enter First Number ");
	scanf("%d",&a);
	printf("Enter Second Number ");
	scanf("%d",&b);
	printf("Before Swapping, the value of First Number =%d",a);
	printf("\nBefore Swapping, the value of Second Number =%d",b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\nAfter Swapping, the value of First Number =%d",a);
	printf("\nAfter Swapping, the value of Second Number =%d",b);
	return 0;
}
