public class DecToBin {
    static int decToBin(int dec) {
        int bin = 0;
        int n = 1;

        while (dec > 0) {
            int digit = dec % 2;
            bin = bin + n * digit;
            dec /= 2;
            n *= 10;
        }

        return bin;
    }

    public static void main(String[] args) {
        int dec = 17;

        System.out.println(decToBin(dec));
    }
}
