// Write a program for time conversion
#include<stdio.h>
int main() {
	int choice;
	float a,b;
	printf("1.Minutes to Seconds\n2.Seconds to Minutes\n3.Minutes to Hours\n4.Hours to Minutes\n");
    scanf("%d",&choice);
    printf("Enter Time to be converted :");
    scanf("%f",&a);
	switch(choice) {
		case 1:b=a*60;
		printf("\n%f Minutes is %.2f Seconds.",a,b);
		break;
		case 2:b=a/60;
		printf("\n%f Seconds is %.2f Minutes.",a,b);
		break;
		case 3:b=a/60;
		printf("\n%f Minutes is %.2f Hours.",a,b);
		break;
		case 4:b=a*60;
		printf("\n%f Hours is %.2f Minutes.",a,b);
		break;
		default:printf("Error");
	}
	return 0;
}