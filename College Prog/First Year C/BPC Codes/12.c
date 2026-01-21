// Write a program to print grade of student on the basis of percentage:
//a. If per greater than or equal to 75 ? A grade
//b. If per between 60-75 ? B grade
//c. If per between 50-60 ? C grade
//d. If per between 40-50 ? D grade
//e. If per less than 40 ? Fail
#include<stdio.h>
int main() {
	int marks;
	printf("Enter your marks ");
	scanf("%d",&marks);
	if(marks<0 || marks>100) 
	printf("Wrong marks");
	else
	if(marks>=75)
	printf("A Grade");
	else
	if(marks>=60&&marks<=75)
	printf("B Grade");
	else
	if(marks>=50&&marks<=60)
	printf("C Grade");
	else
	if(marks>=40&&marks<=50)
	printf("D Grade");
	else
	printf("Failed");
	return 0;
}
