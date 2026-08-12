public class RevArray {
    static void rev(int[] arr, int strt, int end) {
        if (strt == end || strt > end) {
            return;
        }
        int temp = arr[strt];
        arr[strt] = arr[end];
        arr[end] = temp;
        rev(arr, strt + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 , 8};
        rev(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
