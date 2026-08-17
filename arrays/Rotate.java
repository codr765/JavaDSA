public class Rotate {

    static void reverse(int[] nums, int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[start + end - i];
            nums[start + end - i] = temp;
        }
    }

    static void leftRotate(int[] nums, int place) {
        // Brute Force

        /*
         * int[] tmpNums = new int[place];
         * 
         * for (int i = 0; i < place; i++) {
         * tmpNums[i] = nums[i];
         * }
         * 
         * for (int i = place; i < nums.length; i++) {
         * nums[i - place] = nums[i];
         * }
         * 
         * int ind = 0;
         * 
         * for (int i = nums.length - place; i < nums.length; i++) {
         * nums[i] = tmpNums[ind++];
         * }
         */

        reverse(nums, 0, place - 1);
        reverse(nums, place, nums.length - 1);

        reverse(nums, 0, nums.length - 1);

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        leftRotate(nums, 2);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
