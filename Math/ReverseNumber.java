package Math;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = -1234;
        System.out.println(-123%10);
        System.out.println(reverse(number));
    }
    
    public static int reverse(int x) {
        int rev = 0;
        if((x & 0xFFFF) == 0) return 0;
        while(x!=0){
            int d = x % 10;
            rev = rev * 10 + d;
            x /= 10;
        }
        return rev;
    }
}

