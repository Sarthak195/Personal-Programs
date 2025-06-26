// Write a program to check how many numbers is prime & not prime in a list
#include<stdio.h>
void main() {
     int i,n,ar[100],j,counter;
 printf("Enter the size of the array ");
 scanf("%d",&n);
   printf("Now enter the elements of the array ");
 for(i=0;i<n;i++) {
      scanf("%d",&ar[i]); }
     printf("The prime numbers in the array are ");
     for(i=0;i<n;i++) {
           counter=0;
           for(j=2;j<ar[i];j++) {
                 if(ar[i]%j==0) {
                       counter=1;
                       break; } }
                 if(counter==0) {
                 printf("\t %d",ar[i]); } } }