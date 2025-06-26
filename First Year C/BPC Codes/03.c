// Write a program to find sum of individual digits of any three digits number
#include<stdio.h>
int main() {
	int num,a,b,c;
	printf("Enter 3 Digit Number ");
	scanf("%d",&num);
	a=num/100;
	b=((num%100)/10);
	c=num%10;
	printf("Sum of Digits= %d",a+b+c);
	return 0;
} 
