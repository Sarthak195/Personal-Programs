// Write a program for currency conversion
#include<stdio.h>
int main() {
	int choice;
	float a,b;
	printf("1.Rupees to Dollars\n2.Dollars to Rupees\n");
    scanf("%d",&choice);
    printf("Enter Currency to be converted :");
    scanf("%f",&a);
	switch(choice) {
		case 1:b=a*0.012;
		printf("%f Rupees is %.2f Dollars.",a,b);
		break;
		case 2:b=a*83.2;
		printf("%f Dollars is %.2f Rupees.",a,b);
		break;
		default:printf("Error");
	}
	return 0;
}
