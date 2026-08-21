public class NextPer {
    static void nextPer(int[] nums) {

        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;

                left++;
                right--;
            }

            return;
        }

        int minIndex = -1;

        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                minIndex = i;
                break;
            }
        }

        int tmp = nums[pivot];
        nums[pivot] = nums[minIndex];
        nums[minIndex] = tmp;

        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right) {
            tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 4, 3, 0, 0, 0 };

        nextPer(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
