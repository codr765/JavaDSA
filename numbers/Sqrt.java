public class Sqrt {
    static int sqrt(int n) {
        int sqrt = 0;
        for (int i = 0; i * i <= n; i++) {
            sqrt = i;
        }
        return sqrt;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }
}
