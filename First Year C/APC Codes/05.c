//Program to count vowels and consonants in a string using pointer
#include <stdio.h>
int main() {
    char str[50], *ptr;
    int vcnt=0, ccnt=0;
    printf("Enter a string: ");
    scanf("%s",str);
    ptr=str;
    while (*ptr!='\0') {
        if(*ptr=='a'||*ptr=='A'||*ptr=='e'||*ptr=='E'||*ptr=='i'||*ptr=='I'||*ptr=='o'||*ptr=='O'||*ptr=='u'||*ptr=='U')
        {vcnt++;}
        else {ccnt++;}
    ptr++; }
    printf("Total Number of vowels are: %d\n",vcnt);
    printf("Total Number of consonants are: %d",ccnt);
    return 0;
}