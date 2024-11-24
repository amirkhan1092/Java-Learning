package Basics.Critical_Question;

public class Long_WithNWithoutL {
    public static void main(String[] args) {
        long val_withL = 365 * 24 * 60 * 60 * 1000L;
        long val_withoutL = 365 * 24 * 60 * 60 * 1000;
        System.out.println(val_withL);  // 31536000000
        System.out.println(val_withoutL); // 1471228928

    }
}
