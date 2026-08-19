public class Kadane {

static void maxSum(int[] nums) {
    int currSum = nums[0];
    int maxSum = nums[0];

    int start = 0;
    int end = 0;
    int tempStart = 0;

    for (int i = 1; i < nums.length; i++) {

        if (nums[i] > currSum + nums[i]) {
            currSum = nums[i];
            tempStart = i;
        } else {
            currSum += nums[i];
        }

        if (currSum > maxSum) {
            maxSum = currSum;
            start = tempStart;
            end = i;
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