class Solution4 {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = { 0, 0 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }

        return arr;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 5, 11 };
        int target = 9;

        Solution4 solution = new Solution4();

        int arr[] = solution.twoSum(nums, target);

        System.out.println(arr[0] + " " + arr[1]);
    }
}