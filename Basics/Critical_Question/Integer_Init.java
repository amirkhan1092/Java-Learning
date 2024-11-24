package Basics.Critical_Question;

public class Integer_Init {
    public static void main(String[] args) {

        // Integer caching range memory is 1 byte
    // Integer Wrapper Classes     
    Integer a = 200;
    Integer b = 200;

    // number first auto boxed 
    if(a == b){
        System.out.println("Both are Equal");
    }
    else{
        System.out.println("Not Equals");
    }
}
}