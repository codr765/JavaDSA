public class Sort012 {

    static void sort(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {

            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;

                left++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;

                right--;
            }

        }
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 1, 0, 1, 2, 1, 0, 1, 0, 2, 0, 1 };

        sort(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}