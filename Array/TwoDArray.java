import java.util.*;

public class TwoDArray {
    
    public static void main(String[] args) {
        int [][] arr = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 12}};
    
        Arrays.sort(arr, (a, b)->Integer.compare(a[1], b[1]));
        
        System.out.println(Arrays.deepToString(arr));
        
   
}}
