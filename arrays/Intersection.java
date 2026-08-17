public class Intersection {

    static void intersection(int[] a, int[] b) {
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6, 8 };
        int[] b = { 2, 4, 5, 6, 7, 8, 9 };

        intersection(a, b);
    }
}
