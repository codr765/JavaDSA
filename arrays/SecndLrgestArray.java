public class SecndLrgestArray {

    static int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 1, 5, 1, 6, 8, 6};

        System.out.println(secondLargest(nums));
    }
}