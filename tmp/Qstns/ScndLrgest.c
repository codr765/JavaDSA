#include <stdio.h>

void main()
{
    int nums[10] = {4, 3, 5, 6, 1, 2, 5, 4, 5, 6};

    int largest = nums[0];
    int secondLargest = nums[0];

    for (int i = 1; i < 10; i++)
    {
        if (nums[i] > largest)
        {
            secondLargest = largest;
            largest = nums[i];
        }
        else if (nums[i] > secondLargest && nums[i] < largest)
        {
            secondLargest = nums[i];
        }
    }

    printf("Largest = %d\n", largest);
    printf("Second Largest = %d\n", secondLargest);
}