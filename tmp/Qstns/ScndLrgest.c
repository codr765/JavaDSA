void main()
{
    int nums[10] = {4, 3, 5, 6, 1, 2, 5, 4, 5, 6};

    int largest = nums[0];
    int secondLargest = nums[0];

    for (int i = 0; i < 10; i++)
    {
        if (nums[i] > largest)
        {
            largest = nums[i];
        }
    }
}