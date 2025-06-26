#include<stdio.h>
int main () {
int choice1,choice2;
float a,b;
printf("1.Currency conversion\n2.Temperature conversion\n3.Weight conversion\n4.Length conversion\n5.Time conversion\n6.Energy conversion\n");
scanf("%d",&choice1);
switch(choice1)
{case 1:{
	printf("1.Rupees to Dollars\n2.Dollars to Rupees\n");
    scanf("%d",&choice2);
    printf("Enter Currency to be converted :");
    scanf("%f",&a);
	switch(choice2) {
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
break;
case 2:{
	printf("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius\n");
    scanf("%d",&choice2);
    printf("Enter Temperature to be converted :");
    scanf("%f",&a);
	switch(choice2) {
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
break;
case3:{
	printf("1.Kilograms to Grams\n2.Grams to Kilograms\n");
    scanf("%d",&choice2);
    printf("Enter Weight to be converted :");
    scanf("%f",&a);
	switch(choice2) {
		case 1:b=a*1000;
		printf("\n%f Kilograms is %.2f Grams.",a,b);
		break;
		case 2:b=a/1000;
		printf("\n%f Grams is %.2f Kilograms.",a,b);
		break;
		default:printf("Error");
	}
	return 0;
}
break;
case 4:{
	printf("1.Meters to Centimeters\n2.Centimeters to Meters\n3.Meters to Kilometers\n4.Kilometers to Meters\n");
    scanf("%d",&choice2);
    printf("Enter Distance to be converted :");
    scanf("%f",&a);
	switch(choice2) {
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
break;
case 5:{
	printf("1.Minutes to Seconds\n2.Seconds to Minutes\n3.Minutes to Hours\n4.Hours to Minutes\n");
    scanf("%d",&choice2);
    printf("Enter Time to be converted :");
    scanf("%f",&a);
	switch(choice2) {
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
break;
case 6:{
	printf("1.Joule to Calories\n");
	printf("2.Calories to Joule\n");
    scanf("%d",&choice2);
    printf("Enter Temperature to be converted :");
    scanf("%f",&a);
	switch(choice2) {
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
break;
default:printf("error");
}return 0;}
