// Write a function to find sum of two numbers. 
#include<stdio.h>
void main(){
   int a,b,c ;
   int addition(int,int) ; 
   printf("Enter any two integer numbers : ") ;
   scanf("%d%d", &a, &b);
   c = addition(a,b) ;  
   printf("sum = %d", c); }
int addition(int a, int b) {
   return a+b ; }