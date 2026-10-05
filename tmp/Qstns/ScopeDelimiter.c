#include <stdio.h>

#define MAX 100

int main()
{
    char str[MAX];
    char stack[MAX];
    int top = -1;

    printf("Enter expression: ");
    scanf("%s", str);

    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == '(' || str[i] == '{' || str[i] == '[')
        {
            stack[++top] = str[i];
        }
        else if (str[i] == ')' || str[i] == '}' || str[i] == ']')
        {
            if (top == -1)
            {
                printf("Incorrect");
                return 0;
            }

            char open = stack[top--];

            if ((str[i] == ')' && open != '(') ||
                (str[i] == '}' && open != '{') ||
                (str[i] == ']' && open != '['))
            {
                printf("Incorrect");
                return 0;
            }
        }
    }

    if (top == -1)
        printf("Correct");
    else
        printf("Incorrect");

    return 0;
}