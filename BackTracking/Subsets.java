package BackTracking;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        List<List<Integer>> res = new ArrayList<List<Integer>>(); 
        List<Integer> cur = new ArrayList<>();
        backTracking(nums, 0, cur, res);
        System.out.println(res.toString());
    }

    public static void backTracking(int [] nums, int index, List<Integer> cur, List<List<Integer>> res){
        if(index > nums.length) return;
        if(index == 3) {System.out.println("at first call");
    System.out.println(cur.toString());
    }
        res.add(new ArrayList<>(cur));

        for(int i=index; i<nums.length; i++){
            cur.add(nums[i]);
            backTracking(nums, i+1, cur, res);
            cur.remove(cur.size()-1);
        }

    }
}
