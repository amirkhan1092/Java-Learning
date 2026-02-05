package Greeedy;
import java.util.*;
class  maximumUnits{

    public static void main(String[] args) {
        maximumUnits obj = new maximumUnits();
        // int[][] arr = {{1, 3}, {2, 2}, {3, 1}};
        int [][] arr = {{5,10},{2,5},{4,7},{3,9}};
        System.out.println(obj.maximumUnits1(arr, 10));
    }

    public int maximumUnits1(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b)-> Integer.compare(a[1], b[1]));
        int res=0;
        System.out.println(Arrays.deepToString(boxTypes));
        System.out.println("Truck Size--> "+truckSize);
        for(int i=boxTypes.length-1; i>=0; i--){
            int numberOfBox = boxTypes[i][0];
            int unitValue = boxTypes[i][1];
            // System.out.println(numberOfBox);
            // System.out.println(unitValue);
            
            if(truckSize > numberOfBox){
                truckSize -= numberOfBox;
                System.out.println("Truck Size--> "+truckSize);
                res += numberOfBox*unitValue;
                // System.out.println("Filled Unit"+res);

            }
            else{
                res += truckSize*unitValue;
                break;
            }
        }
        return res;
    }


}
