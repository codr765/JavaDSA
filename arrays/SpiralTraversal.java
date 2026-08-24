public class SpiralTraversal {

    static void spiral(int[][] nums) {
        int top = 0;
        int bottom = nums.length - 1;

        int left = 0;
        int right = nums[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left -> Right
            for (int j = left; j <= right; j++) {
                System.out.print(nums[top][j] + " ");
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(nums[i][right] + " ");
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(nums[bottom][j] + " ");
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(nums[i][left] + " ");
                }
                left++;
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

        spiral(nums);

        System.out.println('\n');

        for (int[] is : nums) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
    }
}
