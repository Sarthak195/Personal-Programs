// Write a program for length conversion
#include<stdio.h>
int main() {
	int choice;
	float a,b;
	printf("1.Meters to Centimeters\n2.Centimeters to Meters\n3.Meters to Kilometers\n4.Kilometers to Meters\n");
    scanf("%d",&choice);
    printf("Enter Distance to be converted :");
    scanf("%f",&a);
	switch(choice) {
		case 1:b=a*100;
		printf("\n%f Meters is %f Centimeters.",a,b);
		break;
		case 2:b=a/100;
		printf("\n%f Centimeters is %.2f Meters.",a,b);
		break;
		case 3:b=a/1000;
		printf("\n%f Meters is %.3f Kilometers.",a,b);
		break;
		case 4:b=a*1000;
		printf("\n%f Kilometers is %f Meters.",a,b);
		break;
		default:printf("Error");
	}
	return 0;
}