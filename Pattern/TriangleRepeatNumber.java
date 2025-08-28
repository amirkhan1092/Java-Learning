package Pattern;

import java.util.Scanner;

public class TriangleRepeatNumber {
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        rows = sc.nextInt();

        System.out.println("You Entered:"+rows);
        int count=1;
        for(int i=1; i<=rows; i++){
            count=1;
            for(int j=1; j<=i; j++){
                System.err.print(j);
            }
            System.out.println();
        }
        // System.err.println("This is Error");
        sc.close();
    }
}
