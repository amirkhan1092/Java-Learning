package Math;

public class ReverseNumber {

    public static void main(String[] args) {
        char number = 7232;
        // System.out.println(-123%10);
        System.out.println(reverse(number));
    }
    
    public static char reverse(char x) {

        char rev = 0;
        while(x !=0){
            char d = (char)( x % 10);
            rev = (char)(rev * 10 + d);
            x /= (char)10;
        }

        return rev;

    }


}

