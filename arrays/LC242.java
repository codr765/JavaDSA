public class LC242 {
    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
            hash[t.charAt(i)]--;
        }

        for (int i : hash) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
