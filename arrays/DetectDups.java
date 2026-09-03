public class DetectDups {
    static boolean detect(int[] nums) {
        int[] hash = new int[10];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        for (int i : hash) {
            if (i > 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 1, 2, 3 };

        System.out.println(detect(nums));
    }
}
