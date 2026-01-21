// Write a program to check given number in range of 100-200 or not
#include<stdio.h>
int main() {
	int num;
	printf("Enter the Number ");
	scanf("%d",&num);
	if(num<100) printf("%d is not allowed",num);
	if(num>=100) {
		if(num<=200)
		printf("%d is Allowed",num);
		if(num>200)
		printf("%d is not allowed",num);
	}
	return 0;
}
