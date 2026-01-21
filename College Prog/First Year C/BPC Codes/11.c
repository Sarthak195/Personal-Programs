// Write a program to check given number is palindrome or not
#include<stdio.h>
int main() {
	int input,num,sum=0,temp;
	printf("Enter an Integer ");
	scanf("%d",&input);
	temp=input;
	while(input>0) {
		num=input%10;
		sum=(sum*10)+num;
		input=input/10;}
	if(temp==sum) 
	printf("%d is a palindrome",temp);
	else 
	printf("%d is not a palindrome",temp);
	return 0;	
}
