public class Rotations {
    public static void main(String[] args) {
        int num = 1234;
        int n = num;

        int dgts = 0;
        int pwr = 1;

        while (n != 0) {
            n /= 10;
            dgts++;
            pwr *= 10;
        }
        pwr /= 10;
        n = num;

        for (int i = 0; i < dgts; i++) {
            int uDgt = n % 10;
            n /= 10;
            n += uDgt * pwr;
            System.out.println(n);
        }
    }
}
