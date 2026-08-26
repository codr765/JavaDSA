public class HollowRect {
    public static void main(String[] args) {
        int len = 6;
        int brd = 4;

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= brd; j++) {
                if (i == 1 || i == len || j == 1 || j == brd) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
