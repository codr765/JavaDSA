public class Pow3 {
    static boolean isPowerOf3(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 81;
        System.out.println(isPowerOf3(n));
    }
}