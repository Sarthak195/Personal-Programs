// Write a program to check given number is even or odd
#include<stdio.h>
int main() {
	int num;
	printf("Enter the Number ");
	scanf("%d",&num);
	if(num%2==0) {
		printf("Number is Even");
	}
		if(num%2!=0) {
		printf("Number is Odd");
	}
	return 0;
}
