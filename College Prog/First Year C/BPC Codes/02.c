// Write a program to perform arithmetic operation on two numbers
#include<stdio.h>
int main() {
	int a,b;
	printf("Enter First Number ");
	scanf("%d",&a);
	printf("Enter Second Number ");
	scanf("%d",&b);
	printf("Sum= %d",a+b);
	printf("\nDifference= %d",a-b);
	printf("\nProduct= %d",a*b);
	printf("\nDivision= %d",a/b);
	printf("\nRemainder= %d",a%b);
	return 0;
}
