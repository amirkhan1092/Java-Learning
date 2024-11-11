// Java Programs for number theory 

package Basics.DataTypes;

import java.util.Scanner;

class Numbers{
  public static void main(String[] args) {
    System.out.println("Enter the Integer Value ");
    Scanner sc = new Scanner(System.in);
    int a;
    float b;
    double c;
    char ch;
    // b = 34.6f;
    a = sc.nextInt();
    // a = 'A';
    b = sc.nextFloat();
    c = sc.nextDouble();
    // ch = 65;
    ch = sc.next().charAt(0);
    // ch = sc.nextByte();  // error
    System.out.println("You entered Integer: "+a);
    System.out.println("You entered Real number: "+b);
    System.out.println("You entered Real number(Large): "+c);
    System.out.println("You entered at char value: "+ch);
    sc.close();
  }  
}