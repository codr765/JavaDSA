public class Insertion {
    static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j != 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
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
