package TwoPointer;

import java.util.*;

public class BuyTwoChocolates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int money = sc.nextInt();
            chocolates(a, money);
            System.out.println(); // Blank line after each test case
        }
        sc.close();
    
    }

    public static void chocolates(int[] a, int money) {
        Arrays.sort(a);
        int left = 0, right = a.length - 1;
        int bestSum = -1;
        int i = 0, j = 0;

        while (left < right) {
            int sum = a[left] + a[right];
            if (sum <= money) {
                if (sum > bestSum || (sum == bestSum && (a[right] - a[left]) < (j - i))) {
                    bestSum = sum;
                    i = a[left];
                    j = a[right];
                }
                left++; // try increasing sum
            } else {
                right--; // sum too large
            }
        }

        if (bestSum == -1) {
            System.out.println("No valid pair available.");
        } else {
            System.out.println("Deepak should buy chocolates whose prices are " + i + " and " + j + ".");
        }
    }
}