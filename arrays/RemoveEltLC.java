public class RemoveEltLC {

    static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 5, 1, 2, 6, 4, 5};
        int elt = 4;

        int k = removeElement(nums, elt);

        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}