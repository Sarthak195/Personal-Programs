#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isOperator(char ch) {
    char ops[] = "+-*/=%";
    for (int i = 0; ops[i]; i++) {
        if (ch == ops[i])
            return 1;
    }
    return 0;
}

int main() {
    char line[300];
    int i, total = 0;

    printf("Enter C code (type END to finish):\n");

    while (1) {
        fgets(line, sizeof(line), stdin);

        /* Stop condition for Programiz */
        if (strncmp(line, "END", 3) == 0)
            break;

        i = 0;
        while (line[i] != '\0') {

            if (isspace(line[i])) {
                i++;
                continue;
            }

            /* Identifier / Keyword */
            if (isalpha(line[i]) || line[i] == '_') {
                while (isalnum(line[i]) || line[i] == '_')
                    i++;
                total++;
                continue;
            }

            /* Constant */
            if (isdigit(line[i])) {
                while (isdigit(line[i]))
                    i++;
                total++;
                continue;
            }

            /* Operator */
            if (isOperator(line[i])) {
                total++;
                i++;
                continue;
            }

            /* Special Symbol */
            if (ispunct(line[i])) {
                total++;
                i++;
                continue;
            }

            i++;
        }
    }

    printf("\nTotal lexical elements = %d\n", total);

    return 0;
}
