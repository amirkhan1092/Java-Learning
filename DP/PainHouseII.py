from typing import List

class Solution:
    def minCostII(self, costs: List[List[int]]) -> int:
        n = len(costs)
        if n == 0:
            return 0
        k = len(costs[0])
        if k == 0:
            return 0

        min1 = min2 = -1  # Indexes of the smallest and second smallest in the previous row

        for i in range(n):
            lastMin1, lastMin2 = min1, min2
            min1 = min2 = -1

            for j in range(k):
                if i > 0:
                    if j != lastMin1:
                        costs[i][j] += costs[i - 1][lastMin1]
                    else:
                        costs[i][j] += costs[i - 1][lastMin2]

                # Update current min1 and min2
                if min1 == -1 or costs[i][j] < costs[i][min1]:
                    min2 = min1
                    min1 = j
                elif min2 == -1 or costs[i][j] < costs[i][min2]:
                    min2 = j

        return costs[n - 1][min1]


obj = Solution()

data = """
4 2
1 2
2 1
1 2
2 1



""".strip();
lst = []
for dt in data.split("\n")[1:]:
    lst.append(list(map(int, dt.split())))
# ['3 4', '3 4 4 5', '2 4 1 4', '1 2 3 4']

print(obj.minCostII(lst))