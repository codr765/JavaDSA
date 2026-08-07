public class Automorphic {
    public static void main(String[] args) {
        int n = 76;
        int sqr = n * n;

        while (n != 0) {
            if (sqr % 10 == n % 10) {
                sqr /= 10;
                n /= 10;
            }
            else{
                System.out.println("Not Automorphic");
                return;
            }
        }
        System.out.println("Automorphic");
    }
}
