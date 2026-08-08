public class Ptrn6 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c ", ch + j - 1);
            }
            System.out.println();
        }
    }
}
