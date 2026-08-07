public class SmallestNextPal {

    static boolean all9(int[] n) {
        for (int i : n) {
            if (i != 9) {
                return false;
            }
        }
        return true;
    }

    static boolean compare(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                return false;
            }

            if (a[i] > b[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        int[] arr = num.clone();

        if (all9(num)) {
            System.out.print("1");
            for (int i = 0; i < num.length - 1; i++) {
                System.out.print("0");
            }
            System.out.print("1");
            return;
        }

        int size = num.length;

        for (int i = size / 2; i >= 0; i--) {
            arr[size - i - 1] = arr[i];
        }

        if (compare(arr, num)) {
            for (int i : arr) {
                System.out.print(i);
            }
            return;
        }

        int carry = 1;
        int left;
        int right;

        if (size % 2 == 0) {
            left = size / 2 - 1;
            right = left + 1;
        } else {
            left = size / 2;
            right = left;
        }

        while (carry != 0 && left >= 0) {
            arr[left] += carry;
            carry = arr[left] / 10;
            arr[left] %= 10;
            arr[right] = arr[left];
            left--;
            right++;
        }

        while (left >= 0) {
            arr[right] = arr[left];
            left--;
            right++;
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}