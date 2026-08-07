import java.util.Scanner;

public class Happy {

    static int sumOfSqrs(int n) {
        int res = 0;

        while (n != 0) {
            int digit = n % 10;
            res += digit * digit;
            n /= 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int num;
        int curr;
        int nxt;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        num = sc.nextInt();

        curr = num;
        nxt = num;

        do {
            curr = sumOfSqrs(curr);
            nxt = sumOfSqrs(sumOfSqrs(nxt));
        } while (curr != nxt);

        if (curr == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Unhappy Number");
        }

        sc.close();
    }
}
