public class NumOfDgts {
    static int numOfDgts(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + numOfDgts(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(numOfDgts(13532));
    }
}
