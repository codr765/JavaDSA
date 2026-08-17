public class MaxConOnes {

    static int maxConOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 5, 6, 3, 2 };

        System.out.println(maxConOnes(nums));
    }
}
