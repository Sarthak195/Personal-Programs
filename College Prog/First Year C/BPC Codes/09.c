// Write a program to check given year is leap year or not
#include<stdio.h>
int main() {
int Year,num;
printf("Enter the Year ");
scanf("%d",&Year);
num=Year%4;
if(num==0) {
printf("%d is a Leap Year",Year);
}
if(num!=0) {
printf("%d is not a Leap Year",Year);
}
return 0;
}
