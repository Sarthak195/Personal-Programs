// Write a program to swap any two numbers using third variable 
#include<stdio.h>
int main() {
	int a,b,c;
	printf("Enter First Number ");
	scanf("%d",&a);
	printf("Enter Second Number ");
	scanf("%d",&b);
	printf("Before Swapping, the value of Numbers are %d and %d",a,b);
	c=a;
	a=b;
	b=c;
	printf("\nAfter Swapping, the value of First Number =%d",a);
	printf("\nAfter Swapping, the value of Second Number =%d",b);
	return 0;
}
