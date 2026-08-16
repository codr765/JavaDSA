public class Selection {
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int smallest = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[smallest]) {
                    smallest = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 9, 1, 90, 12, 5 };

        sort(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}