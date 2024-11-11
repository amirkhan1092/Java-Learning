package Basics.HelloWorld;

public class Hello_World {
    
public static void main(String[] args) {
    System.out.println("Hello, World!");

    // multiline String text
    String msg = String.format("""
            Hello, Java
            Are we ready to introduce multiline string
            """);
    System.out.println(msg);
}
}
