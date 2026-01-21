// Write a program to find the no of char no of word and no of lines from given text input
#include <stdio.h>
#include<string.h>
int main() {
    char text[1000];
    int charCount = 0, wordCount = 0, lineCount = 0;
    char ch;
    printf("Enter text (Ctrl+D or Ctrl+Z to end input):\n");
    while ((ch = getchar()) != EOF) {
        if (ch != '\n') {
            charCount++; }
        if (ch == ' ' || ch == '\n') {
            wordCount++; }
        if (ch == '\n') {
            lineCount++; } }
    if (charCount > 0) {
        wordCount++; }
    printf("\nNumber of characters: %d\n", charCount);
    printf("Number of words: %d\n", wordCount);
    printf("Number of lines: %d\n", lineCount);
    return 0; }
