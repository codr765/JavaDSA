public class Ptrn8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.printf("%c ", 'A' + n - j);
            }
            System.out.println();
        }
    }
}
