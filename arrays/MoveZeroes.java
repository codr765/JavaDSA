public class MoveZeroes {

    static void moveZeroes(int[] nums) {
        int ind = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[ind++] = nums[i];
            }
        }

        for (int i = ind; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 3, 5, 0, 2, 0, 6 };

        moveZeroes(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
