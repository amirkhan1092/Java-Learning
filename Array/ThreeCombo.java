// import java.util.*;

// public class ThreeCombo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         // Solve
//         List<List<Integer>> result = threeSum(nums);

//         // Output
//         if (result.isEmpty()) {
//             System.out.println("[]");
//         } else {
//             for (List<Integer> triplet : result) {
//                 System.out.println(triplet);
//             }
//         }

//         sc.close();
//     }

//     public static List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums); // Sort array

//         int n = nums.length;
//         for (int i = 0; i < n - 2; i++) {
//             // Avoid duplicate "first elements"
//             if (i > 0 && nums[i] == nums[i - 1]) continue;

//             int left = i + 1, right = n - 1;
//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];

//                 if (sum == 0) {
//                     res.add(Arrays.asList(nums[i], nums[left], nums[right]));

//                     // Move left and right pointers skipping duplicates
//                     while (left < right && nums[left] == nums[left + 1]) left++;
//                     while (left < right && nums[right] == nums[right - 1]) right--;

//                     left++;
//                     right--;
//                 } else if (sum < 0) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }

//         return res;
//     }

// }

// FUNCTION CheckCondition(a, b)
//   IF a AND b THEN
//     PRINT "Both true"
//   ELSE
//     PRINT "At least one false"
//   END IF
// END FUNCTION


// FUNCTION CalculateValue(a, b)
//     return a AND b+1
// END FUNCTION


// CALL CheckCondition(FALSE, CalculateValue(0, 0))



// A) Yes, always. B) No, only if 'a' is TRUE. C) No, only if 'a' is FALSE. D) 




// p = 1
// q = 2
// r = 3

// if (p > 0 OR q < 5 AND r == 0 AND p/q > 0) then
//     print("TRUE")
// else
//     print("FALSE")
