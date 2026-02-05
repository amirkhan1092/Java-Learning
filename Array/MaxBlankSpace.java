import java.util.Scanner;

public class MaxBlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i=0; i<testcase; i++){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            int res = max_zero(arr);
            System.out.println("Answer "+res);
        }
        sc.close();
    }

    private static int max_zero(int[] arr) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'max_zero'");
        int maxzero = 0;
        int temp=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) temp++;
            else{
                maxzero = temp > maxzero? temp : maxzero;
                temp=0;
            }
        }
        maxzero = temp > maxzero? temp : maxzero;
        
        return maxzero;
    }


}
