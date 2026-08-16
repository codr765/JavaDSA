public class Merge {
    static void merge(int[] nums, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
        int ind = 0;

        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                tmp[ind++] = nums[i++];
            } else {
                tmp[ind++] = nums[j++];
            }
        }

        while (i <= mid) {
            tmp[ind++] = nums[i++];
        }
        while (j <= end) {
            tmp[ind++] = nums[j++];
        }

        for (int k = 0; k < tmp.length; k++) {
            nums[start + k] = tmp[k];
        }
    }

    static void divide(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        divide(nums, start, mid);
        divide(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    static void sort(int[] nums) {
        divide(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        int[] nums = { 4, 2, 9, 1, 90, 12, 5 };

        sort(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}