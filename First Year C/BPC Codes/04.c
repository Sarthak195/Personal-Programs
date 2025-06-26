// Write a program to print any three digit number in reverse order
#include<stdio.h>
int main() {
	int num,a,b,c;
	printf("Enter 3 Digit Number ");
	scanf("%d",&num);
	a=num/100;
	b=((num%100)/10);
	c=num%10;
	printf("Reversed Number= %d",a+b*10+c*100);
	return 0;
}
