public class RearngArrayBySignII {

    static void rearrange(int[] nums) {

        int[] pos = new int[nums.length];
        int[] neg = new int[nums.length];

        int p = 0;
        int n = 0;

        for (int i : nums) {
            if (i > 0) {
                pos[p++] = i;
            } else {
                neg[n++] = i;
            }
        }

        int i = 0;
        int index = 0;

        while (i < p && i < n) {
            nums[index++] = pos[i];
            nums[index++] = neg[i];
            i++;
        }

        while (i < p) {
            nums[index++] = pos[i++];
        }

        while (i < n) {
            nums[index++] = neg[i++];
        }
    }

    public static void main(String[] args) {

        int[] nums = {
                3, 2, 5, -1, -2, 4, 5, 6, -2, -4
        };

        rearrange(nums);

        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }
}