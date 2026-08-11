class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

public class LargestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = { "flower", "flow", "flight" };

        Solution solution = new Solution();

        System.out.println(solution.longestCommonPrefix(strs));
    }
}