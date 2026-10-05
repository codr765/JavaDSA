#include <stdio.h>

void push(int stack[], int max, int elt, int *top)
{
    if (*top == max - 1)
    {
        printf("Overflow\n");
        return;
    }

    stack[++(*top)] = elt;
}

void pop(int stack[], int *top)
{
    if (*top == -1)
    {
        printf("Underflow\n");
        return;
    }

    printf("Popped item : %d\n", stack[*top]);
    (*top)--;
}

int main()
{
    int max = 10;
    int stack[max];
    int top = -1;

    push(stack, max, 6, &top);
    push(stack, max, 10, &top);
    push(stack, max, 20, &top);

    pop(stack, &top);
    pop(stack, &top);

    return 0;
}