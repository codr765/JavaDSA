public class Union {

    static void union(int[] a, int[] b) {
        // Brute Force

        /*
         * int[] un = new int[a.length + b.length];
         * 
         * int ind = 0;
         * 
         * for (int i = 0; i < a.length; i++) {
         * int chk = 0;
         * 
         * for (int j = 0; j < ind; j++) {
         * if (un[j] == a[i]) {
         * chk = 1;
         * }
         * 
         * }
         * 
         * if (chk == 0) {
         * un[ind++] = a[i];
         * }
         * }
         * 
         * for (int i = 0; i < b.length; i++) {
         * 
         * int chk = 0;
         * 
         * for (int j = 0; j < ind; j++) {
         * 
         * if (un[j] == b[i]) {
         * chk = 1;
         * }
         * }
         * 
         * if (chk == 0) {
         * un[ind++] = b[i];
         * }
         * }
         * 
         * for (int i : un) {
         * System.out.println(i);
         * }
         */

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                System.out.println(a[i++]);
            } else if (a[i] > b[j]) {
                System.out.println(b[j++]);
            } else {
                System.out.println(a[i]);

                i++;
                j++;
            }
        }

        while (i < a.length) {
            System.out.println(a[i++]);
        }

        while (j < b.length) {
            System.out.println(b[j++]);
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6, 8 };
        int[] b = { 2, 4, 5, 6, 7, 8, 9 };

        union(a, b);
    }
}
