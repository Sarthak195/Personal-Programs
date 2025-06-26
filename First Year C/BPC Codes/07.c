// Write a program to check given character is vowel or consonant
#include<stdio.h>
int main(){
	char cha;
	printf("Enter Alphabetical Character ");
	scanf("%c",&cha);
	switch(cha) {
		case'A':
	case'a':
	printf("%c is a Vowel",cha);
	break;
	case'E':
	case'e':
	printf("%c is a Vowel",cha);
	break;
	case'I':
	case'i':
	printf("%c is a Vowel",cha);
	break;
	case'O':
	case'o':
	printf("%c is a Vowel",cha);
	break;
	case'U':
	case'u':
	printf("%c is a Vowel",cha);
	break;
	default:
		printf("%c is a Consonant",cha);
		break;
		return 0;
	}
	return 0;
}
	

