// Write a program to check given number is Armstrong or not
#include<stdio.h>
int main() {
	int num,a,b,c,result;
	printf("Enter 3 Digit Number ");
	scanf("%d",&num);
	a=num/100;
	b=((num%100)/10);
	c=num%10;
	result=a*a*a+b*b*b+c*c*c;
    if (num==result) {
        printf("%d is an Armstrong Number",num);
    }
    else {
        printf("%d is not an Armstrong Number",num);
    }
	return 0;
}