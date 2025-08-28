import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int k = 3;
        System.out.println("Total SubArray"+subarraySum(arr, k));
        
    }
    static int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        mp.put(0, 1);
        int sum=0;
        int count = 0;
        for(int num: nums){
            sum += num;
            // if(sum == k){
            //     count++;
            // }

            if(mp.containsKey(sum - k)){
                count+= mp.get(sum-k);
            }

            mp.put(sum, mp.getOrDefault(sum, 0)+1);

        }

        return count;
    
}

}
