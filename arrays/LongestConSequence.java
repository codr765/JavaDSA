public class LongestConSequence {

    static boolean linearSrch(int[] nums, int num) {
        for (int i : nums) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }

    static int longestSeq(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int longest = 1;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int currLen = 1;

            while (linearSrch(nums, curr + 1)) {
                curr++;
                currLen++;
            }

            if (currLen > longest) {
                longest = currLen;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2, 101, 102, 103, 104, 105 };

        System.out.println(longestSeq(nums));

    }
}
