class Solution {
    public int lengthOfLongestSubstring(String s) {
        int largest = 0;
        int[] hsh = new int[128];

        for (int i = 0; i < 128; i++) {
            hsh[i] = -1;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right);

            if (hsh[index] >= 0) {
                left = Math.max(left, hsh[index] + 1);
            }

            hsh[index] = right;

            largest = Math.max(largest, right - left + 1);
        }

        return largest;
    }
}

public class LongestSubstrWithoutReptn {

    public static void main(String[] args) {
        String string = "abcabcbb";
        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring(string));
    }
}