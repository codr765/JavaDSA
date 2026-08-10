public class RemDupsFromSortdArray {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

        int k = removeDuplicates(arr);

        System.out.println("Unique count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}