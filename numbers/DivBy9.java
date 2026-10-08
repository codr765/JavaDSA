public class DivBy9 {
    static boolean check(int num) {
        return num % 9 == 0;
    }

    public static void main(String[] args) {
        int num = 636;
        System.out.println(check(num));
    }

}
