public class MajorityElt {
    static int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;

        for (int i : nums) {
            if (i == majority) {
                count++;
            } else if (i != majority) {
                count--;
                if (count == -1) {
                    majority = i;
                    count = 1;
                }
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 2, 1, 1, 1, 2, 1 };
        System.out.println(majorityElement(nums));
    }
}
