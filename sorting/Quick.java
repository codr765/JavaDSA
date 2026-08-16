public class Quick {

    static int partition(int[] nums, int start, int end) {

        int pivot = nums[start];

        int left = start + 1;
        int right = end;

        while (left <= right) {

            while (left <= right && nums[left] <= pivot) {
                left++;
            }

            while (left <= right && nums[right] >= pivot) {
                right--;
            }

            if (left <= right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }

        int tmp = nums[start];
        nums[start] = nums[right];
        nums[right] = tmp;

        return right;
    }

    static void quick(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }

        int pivotIndex = partition(nums, start, end);

        quick(nums, start, pivotIndex - 1);
        quick(nums, pivotIndex + 1, end);
    }

    static void sort(int[] nums) {
        quick(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        int[] nums = { 4, 2, 9, 1, 90, 12, 5 };

        sort(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}