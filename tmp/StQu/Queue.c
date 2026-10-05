#include <stdio.h>

void enqueue(int queue[], int max, int elt, int *rear)
{
    if (*rear == max - 1)
    {
        printf("Overflow\n");
        return;
    }

    queue[++(*rear)] = elt;
}

void dequeue(int queue[], int *front, int rear)
{
    if (*front > rear)
    {
        printf("Underflow\n");
        return;
    }

    printf("Deleted item : %d\n", queue[*front]);
    (*front)++;
}

void main()
{
    int max = 10;
    int queue[max];

    int front = 0;
    int rear = -1;

    enqueue(queue, max, 10, &rear);
    enqueue(queue, max, 20, &rear);
    enqueue(queue, max, 30, &rear);

    dequeue(queue, &front, rear);
    dequeue(queue, &front, rear);
}