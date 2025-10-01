package DP;

public class PainHouseII { 
    public int minCostII(int[][] costs) {
        int n = costs.length;
        if (n == 0) return 0;
        int k = costs[0].length;
        if (k == 0) return 0;

        // Track the least and second least cost from the previous row
        int min1 = -1, min2 = -1;

        for (int i = 0; i < n; i++) {
            int lastMin1 = min1, lastMin2 = min2;
            min1 = -1;
            min2 = -1;

            for (int j = 0; j < k; j++) {
                if (i > 0) {
                    // If previous color was not j, use the min1 cost
                    if (j != lastMin1) {
                        costs[i][j] += costs[i - 1][lastMin1];
                    } else {
                        // If previous color was j, use second min
                        costs[i][j] += costs[i - 1][lastMin2];
                    }
                }
                // Update min1 and min2 for current row
                if (min1 == -1 || costs[i][j] < costs[i][min1]) {
                    min2 = min1;
                    min1 = j;
                } else if (min2 == -1 || costs[i][j] < costs[i][min2]) {
                    min2 = j;
                }
            }
        }

        return costs[n - 1][min1];
    }

    // For testing with console input format
    public static void main(String[] args) {
        int[][] costs = {
            
            {8, 2},
            {4, 3},
            {1, 7}

        };

        PainHouseII solver = new PainHouseII();
        System.out.println(solver.minCostII(costs)); // Output: 5
    }
}


public static void displayUserInfo(String name, int age)

public static void performOperations(int a, int b)

public static String checkEvenOdd(int n)

public static int findLargest(int a, int b, int c)

public static void calculateGrade(int[] marks)

public Employee(int id, String name, double salary)
public int getId()
public String getName()
public double getSalary()







