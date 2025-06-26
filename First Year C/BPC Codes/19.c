// Write a program to check given number is prime or not
#include <stdio.h>
int main() {
  int n, i, c = 0;
  printf("Enter a positive integer: ");
  scanf("%d", &n);
  if (n <=1) {
    printf("Please enter a number greater than 1");
  }
  for (i = 2; i <= n / 2; ++i) {
    if (n % i == 0) {
      c = 1;
      break;
    }
  }
  if (c == 0)
    printf("%d is a prime number.", n);
  else
    printf("%d is not a prime number.", n);

  return 0;
}
