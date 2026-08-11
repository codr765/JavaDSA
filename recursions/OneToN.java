public class OneToN {
    static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        oneToN(n);
    }
}
