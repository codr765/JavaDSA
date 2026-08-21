import java.util.Arrays;

public class Leaders {

    static int[] leader(int[] nums) {

        // Brute Force :

        // int[] leaders = new int[nums.length];
        // int ind = 0;

        // for (int i = 0; i < nums.length; i++) {
        // boolean chk = true;
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[j] >= nums[i]) {
        // chk = false;
        // break;
        // }
        // }

        // if (chk) {
        // leaders[ind++] = nums[i];
        // }
        // }

        // return leaders;

        // Optimized :

        int[] leaders = new int[nums.length];
        int max = nums[nums.length - 1];

        int ind = 0;

        leaders[ind++] = max;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                leaders[ind++] = nums[i];
                max = nums[i];
            }
        }

        return Arrays.copyOf(leaders, ind);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 22, 7, 12, 6, 8 };

        int[] leaders = leader(nums);

        for (int i : leaders) {
            System.out.println(i);
        }

    }
}
