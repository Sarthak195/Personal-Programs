// Write a program for weight conversion
#include<stdio.h>
int main() {
	int choice;
	float a,b;
	printf("1.Kilograms to Grams\n2.Grams to Kilograms\n");
    scanf("%d",&choice);
    printf("Enter Weight to be converted :");
    scanf("%f",&a);
	switch(choice) {
		case 1:b=a*1000;
		printf("%f Kilograms is %.2f Grams.",a,b);
		break;
		case 2:b=a/1000;
		printf("%f Grams is %.3f Kilograms.",a,b);
		break;
		default:printf("Error");
	}
	return 0;
}
