public class CircularPrime {

    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 197;
        String str = Integer.toString(n);

        int len = str.length();

        String string;

        for (int index = 0; index < len; index++) {
            string = str.substring(index, len) + str.substring(0, index);
            System.out.println(string);

            boolean b = isPrime(Integer.parseInt(string));

            if (!b) {
                System.out.println("Not Circular Prime");
                return;
            }
        }

        System.out.println("Circular Prime");
    }
}
