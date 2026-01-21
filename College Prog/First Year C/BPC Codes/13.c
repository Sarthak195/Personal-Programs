// Write a program for addition subtraction multiplication division using switch case
#include<stdio.h>
int main() {
	int a,b,c,choice;
	printf("Enter First Number ");
	scanf("%d",&a);
	printf("Enter Second Number ");
	scanf("%d",&b);
	printf("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n");
	scanf("%d",&choice);
	switch(choice) {
		case 1:c=a+b;
		printf("Sum is %d",c);
		break;
		case 2:c=a-b;
		printf("Difference is %d",c);
		break;
		case 3:c=a*b;
		printf("Product is %d",c);
		break;
		case 4:c=a/b;
		printf("Quotient is %d",c);
		break;
		default:printf("Not an Option");
	}
	return 0;
}
