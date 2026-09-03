public class FindPivot {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 };

        // 0,1,2,3,4,5,6,7,8,9

        int curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < curr) {
                System.out.println(i);
                break;
            }
            curr = nums[i];
        }
    }
}
