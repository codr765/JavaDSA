public class Kadane {

    static void maxSum(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tmpStart = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currSum == 0) {
                tmpStart = i;
            }

            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tmpStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Max Sum: " + maxSum);
        System.out.println("Start Index: " + start);
        System.out.println("End Index: " + end);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, -3, 7, -4, -2, -4, 2 };

        maxSum(nums);
    }
}