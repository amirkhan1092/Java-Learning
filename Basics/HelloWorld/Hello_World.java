package Basics.HelloWorld;
import java.text.MessageFormat;
public class Hello_World {
    
public static void main(String[] args) {
    System.out.println("Hello, World!");

    // multiline String text
    String msg;
    msg = """
        Can you help me to use multi_line String
        in Java as the feature i found preveous in Python
        i am so happy 
        """;
    // msg = String.format("""
    //         Hello, Java
    //         Are we ready to introduce multiline string
    //         and it also hold my data %d
    //         """, 10);
    var v1 = 10;
    var v2 = 20; 
    // msg = "First Value is " + v1 + " Second value" + v2;
    msg =  MessageFormat.format("First Value is {0}%nSecond value {1}", v1, v2);
    System.out.println(msg);
}
}
