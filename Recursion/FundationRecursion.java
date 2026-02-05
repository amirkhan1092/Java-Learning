package Recursion;

import java.util.List;
import java.util.ArrayList;

public class FundationRecursion {
    public static void main(String[] args) {
        // System.out.println("What is recursion");
        // System.out.println("A mechanism where function call itself");
        // displayMyname();
        // System.out.println(displayMyname("Ankit"));
        // System.out.println(displayMyname("Ankit", 'L'));
        // System.out.println(nsum(5));
        // System.out.println(decimalToBinaryString(10));
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(12);
        lst.add(10);
        displayMyname(lst);

    }

    static void displayMyname(List<Integer> s) {
        System.out.println(s);
        for(int i=0; i<s.size(); i++){
            s.remove(i);
            displayMyname(s);
        }

    // }
    // static String displayMyname(String st) {
    //     return "My name is "+st;

    // }
    // static int displayMyname(String st, char ch) {
    //     return ("My name is "+st).length();

    }

    // Recursive method to calculate the sum of first n natural numbers
    static int nsum(int n) {
        if (n <= 0) {
            return 0;
        }
        int partial = nsum(n - 1);
        return n + partial;
    }

    static String decimalToBinaryString(int num){

        if(num == 1){
            return "1";
        }
        else if(num == 0){
            return "0";
        }

        String partial = decimalToBinaryString(num>>1);
        return partial + num % 2;
    }
}
