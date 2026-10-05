#include <stdio.h>

int main()
{
    int nums[10] = {4, 3, 5, 6, 1, 2, 5, 4, 5, 6};

    int largest = nums[0];
    int secondLargest = nums[0];
    int thirdLargest = nums[0];

    for (int i = 1; i < 10; i++)
    {
        if (nums[i] > largest)
        {
            thirdLargest = secondLargest;
            secondLargest = largest;
            largest = nums[i];
        }
        else if (nums[i] > secondLargest && nums[i] < largest)
        {
            thirdLargest = secondLargest;
            secondLargest = nums[i];
        }
        else if (nums[i] > thirdLargest && nums[i] < secondLargest)
        {
            thirdLargest = nums[i];
        }
    }

    printf("Largest = %d\n", largest);
    printf("Second Largest = %d\n", secondLargest);
    printf("Third Largest = %d\n", thirdLargest);

    return 0;
}