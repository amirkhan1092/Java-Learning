package Basics.StandardIO;

import java.util.Scanner;

public class Read_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, out;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        out = num1 + num2;
        System.out.println("Addition of %d and %d is %d", num1, num2, out);
    }
}
