// Write a program for energy conversion
#include<stdio.h>
int main() {
	int choice;
	float a,b;
	printf("1.Joule to Calories\n");
	printf("2.Calories to Joule\n");
    scanf("%d",&choice);
    printf("Enter Temperature to be converted :");
    scanf("%f",&a);
	switch(choice) {
		case 1:b=a*0.239;
		printf("\n%f Joule is %.3f Calories.",a,b);
		break;
		case 2:b=a*4.184;
		printf("\n%f Calories is %.3f Joule.",a,b);
		break;
		default:printf("Error");
	}
	return 0;
}