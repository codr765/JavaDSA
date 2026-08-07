public class Kaprekar {

    static int numberOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            n /= 10;
            sum++;
        }

        return sum;
    }

    static int pow(int num, int power) {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 45;
        int sqr = num * num;

        int sumNum = numberOfDigits(num);

        int chk = 0;

        chk = sqr % pow(10, sumNum) + sqr / pow(10, sumNum);

        if (chk == num) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not Kaprekar Number");
        }
    }
}
