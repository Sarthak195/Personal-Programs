// Write a program for temperature conversion
#include<stdio.h>
int main() {
	int choice;
	float a,b;
	printf("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius\n");
    scanf("%d",&choice);
    printf("Enter Temperature to be converted :");
    scanf("%f",&a);
	switch(choice) {
		case 1:b=(a*1.8)+32;
		printf("%f Celsius is %.2f Fahrenheit.",a,b);
		break;
		case 2:b=(a-32)*5/9;
		printf("%f Fahrenheit is %.2f Celsius.",a,b);
		break;
		default:printf("Error");
	}
	return 0;
}