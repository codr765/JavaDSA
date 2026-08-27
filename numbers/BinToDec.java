public class BinToDec {
    static int binToDec(int bin) {
        int dec = 0;

        int i = 0;

        while (bin > 0) {
            int rem = bin % 10;
            dec = (int) (dec + rem * (Math.pow(2, i)));
            bin /= 10;
            i++;
        }

        return dec;
    }

    public static void main(String[] args) {
        int bin = 1101010;

        System.out.println(binToDec(bin));
    }
}