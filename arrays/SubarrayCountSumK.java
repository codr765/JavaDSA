public class SubarrayCountSumK {
    static int countBrute(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    static int countOptimal(int[] nums, int k) {
        int count = 0;

        

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 5, 3, 2, 1, 5, 6, -4, 7 };
        int k = 3;

        System.out.println(countOptimal(nums, k));
    }
}
