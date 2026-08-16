public class Bubble {
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 9, 1, 90, 12, 5 };
        sort(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
