public class HighstFreq {

    static int hgstFreq(int[] a) {
        int count = 1;
        int maxCount = 1;
        int result = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] == a[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                result = a[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9};

        System.out.println(hgstFreq(nums));
    }
}