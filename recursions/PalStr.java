public class PalStr {

    static void palStr(String string, int strt, int end) {

        if (strt >= end) {
            System.out.println("Palindrome");
            return;
        }

        if (string.charAt(strt) != string.charAt(end)) {
            System.out.println("Not Palindrome");
            return;
        }

        palStr(string, strt + 1, end - 1);
    }

    public static void main(String[] args) {
        String string = "abcba";
        palStr(string, 0, string.length() - 1);
    }
}