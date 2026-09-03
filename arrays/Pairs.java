public class Pairs {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 9, 5, 8, 2, 1 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.printf("(%d : %d) ", nums[i], nums[j]);
            }

            System.out.println();
        }
    }
}
