public class LongestSubarrayWithSumK {

    static int find(int[] nums, int k) {

        // Brute Force :

        /*
         * 
         * int longest = 0;
         * 
         * for (int i = 0; i < nums.length; i++) {
         * 
         * int sum = 0;
         * 
         * for (int j = i; j < nums.length; j++) {
         * 
         * sum += nums[j];
         * 
         * int length = j - i + 1;
         * 
         * if (sum == k) {
         * longest = Math.max(longest, length);
         * }
         * }
         * }
         */

        // Better Soln :

        int longest = 0;

        return longest;
    }

    public static void main(String args[]) {

        int[] nums = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;

        System.out.println(find(nums, k));
    }
}