public class RotateMatrix {

    static void rotateBrute(int[][] nums) {
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                int temp = nums[i][j];
                nums[i][j] = nums[n - j - 1][i];
                nums[n - j - 1][i] = nums[n - i - 1][n - j - 1];
                nums[n - i - 1][n - j - 1] = nums[j][n - i - 1];
                nums[j][n - i - 1] = temp;
            }
        }
    }

    static void rotateOptimal(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = tmp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length / 2; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[i][nums.length - 1 - j];
                nums[i][nums.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 1, 1, 2 },
                { 3, 4, 5, 6 }
        };

        rotateOptimal(nums);

        for (int[] is : nums) {
            for (int is2 : is) {
                System.out.printf("%2d  ", is2);
            }
            System.out.println();
        }
    }
}
