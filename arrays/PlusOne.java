public class PlusOne {

    static int[] plusOne(int[] nums) {

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }

            nums[i] = 0;
        }

        int[] result = new int[nums.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 9, 9, 9 };
        int[] nums2 = plusOne(nums);

        for (int i : nums2) {
            System.out.println(i);
        }
    }
}