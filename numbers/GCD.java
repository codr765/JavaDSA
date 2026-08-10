import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number : ");
        int n2 = scanner.nextInt();

        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        if (n1 == 0) {
            System.out.println("GCD : " + n2);
        } else {
            System.out.println("GCD : " + n1);
        }

        scanner.close();
    }
}
