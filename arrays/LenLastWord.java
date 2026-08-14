public class LenLastWord {

    static int lenLastWord(String s) {
        int len = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (len > 0) {
                    break;
                }
            } else {
                len++;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        String string = "Hello Java";
        System.out.println(lenLastWord(string));
    }
}