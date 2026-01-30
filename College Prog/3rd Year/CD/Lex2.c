#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LENGTH 100

bool isDelimiter(char chr){
return (chr==' '||chr=='+'||chr=='-'||chr=='*'||chr=='/'||
chr==','||chr==';'||chr=='%'||chr=='>'||chr=='<'||
chr=='='||chr=='('||chr==')'||chr=='['||chr==']'||
chr=='{'||chr=='}');
}

bool isOperator(char chr){
return (chr=='+'||chr=='-'||chr=='*'||chr=='/'||
chr=='>'||chr=='<'||chr=='=');
}

bool isValidIdentifier(char* str){
if(isdigit(str[0])||isDelimiter(str[0])) return false;
return true;
}

bool isKeyword(char* str){
const char* keywords[]={
"auto","break","case","char","const","continue","default","do",
"double","else","enum","extern","float","for","goto","if",
"int","long","register","return","short","signed","sizeof","static",
"struct","switch","typedef","union","unsigned","void","volatile","while"
};

for(int i=0;i<32;i++){
if(strcmp(str,keywords[i])==0) return true;
}
return false;
}

bool isInteger(char* str){
if(str==NULL||*str=='\0') return false;
int i=0;
while(isdigit(str[i])) i++;
return str[i]=='\0';
}

char* getSubstring(char* str,int start,int end){
int subLength=end-start+1;
char* subStr=(char*)malloc((subLength+1)*sizeof(char));
strncpy(subStr,str+start,subLength);
subStr[subLength]='\0';
return subStr;
}

int lexicalAnalyzer(char* input){
int left=0,right=0;
int len=strlen(input);

while(right<=len&&left<=right){
if(!isDelimiter(input[right])) right++;

if(isDelimiter(input[right])&&left==right){
if(isOperator(input[right]))
printf("Token: Operator, Value: %c\n",input[right]);
right++;
left=right;
}
else if((isDelimiter(input[right])&&left!=right)||(right==len&&left!=right)){
char* subStr=getSubstring(input,left,right-1);

if(isKeyword(subStr))
printf("Token: Keyword, Value: %s\n",subStr);
else if(isInteger(subStr))
printf("Token: Integer, Value: %s\n",subStr);
else if(isValidIdentifier(subStr))
printf("Token: Identifier, Value: %s\n",subStr);
else
printf("Token: Unidentified, Value: %s\n",subStr);

free(subStr);
left=right;
}
}
return 0;
}

int main(){
char input1[MAX_LENGTH]="int a = b + c";
printf("For Expression 1:\n");
lexicalAnalyzer(input1);

printf("\n");

char input2[MAX_LENGTH]="int x=ab+bc+30+switch+0y";
printf("For Expression 2:\n");
lexicalAnalyzer(input2);

return 0;
}
