package Basics.StandardIO;

import java.util.Scanner;
import java.text.MessageFormat;

public class Read_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner Object Created
        int num1, num2, out;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        sc.close();  // Close the scanner 
        out = num1 + num2;
        // Method1
        // System.out.printf("Addition of %d and %d is %d\n", num1, num2, out);
        System.out.printf("Addition of %d%n and %d is %d%n", num1, num2, out);

        String s;
        // Method2
        // s = String.format("Addition of %d and %d is %d", num1, num2, out);

        // Method3
        // s = "Addition of " + num1 + " and " + num2 + " is " + out;

        // Method4
        // s = MessageFormat.format("Addition of {0} and {1} is {2}", num1, num2, out);

        // Method5
        // s = String.format("""
        //     Addition of %d
        //     and %d
        //     is %d""", num1, num2, out);

        // Method6

        // System.out.println(s);


    }
}
