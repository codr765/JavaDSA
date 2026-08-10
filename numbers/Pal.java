class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }

        if (rev == x) {
            return true;
        }
        return false;
    }
}

public class Pal {
    public static void main(String[] args) {
        int n = 12321;

        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(n));
    }
}
