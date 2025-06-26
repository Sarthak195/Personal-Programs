// Write a program to check given number is positive or negative
#include<stdio.h>
int main() {
	int num;
	printf("Enter the Number ");
	scanf("%d",&num);
	if(num>=0) {
		printf("Number is Positive");
	}
		if(num<0) {
		printf("Number is Negative");
	}
	return 0;
}
