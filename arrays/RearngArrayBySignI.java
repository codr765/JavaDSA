public class RearngArrayBySignI {
    static void rearrange(int[] nums) {

        int[] ans = new int[nums.length];

        int positive = 0;
        int negative = 1;

        for (int i : nums) {
            if (i > 0) {
                ans[positive] = i;
                positive += 2;
            } else {
                ans[negative] = i;
                negative += 2;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }

    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 5, -1, -2, 4, 5, 6, -2, -4, -1, -4 };

        rearrange(nums);

        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }
}
