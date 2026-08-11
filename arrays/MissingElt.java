public class MissingElt {
    static int missing(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i : a) {
            sum1 += i;
        }

        for (int i : b) {
            sum2 += i;
        }
        return sum1 - sum2;
    }

    public static void main(String[] args) {
        int[] a = { 2, 5, 8, 1, 8, 9 };
        int[] b = { 2, 8, 8, 1, 9 };

        System.out.println(missing(a, b));
    }
}
