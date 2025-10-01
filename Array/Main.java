import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Input number
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
        sc.close();
    }
}
