// Write a program to print series of number from 1-100 without using loop
#include<stdio.h>
int main() {
  int i=0;
  begin:
  i=i+1;
  printf("%d\t",i);
  if(i<100)
  goto begin;
   return 0;
}