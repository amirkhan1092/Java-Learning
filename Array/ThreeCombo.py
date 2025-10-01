def three_sum(nums):
    nums.sort()  # Sort array
    res = []
    n = len(nums)

    for i in range(n - 2):
        # Avoid duplicate "first elements"
        if i > 0 and nums[i] == nums[i - 1]:
            continue

        left, right = i + 1, n - 1
        while left < right:
            s = nums[i] + nums[left] + nums[right]

            if s == 0:
                res.append([nums[i], nums[left], nums[right]])

                # Skip duplicates for left and right
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1

                left += 1
                right -= 1
            elif s < 0:
                left += 1
            else:
                right -= 1
    return res


# -------- Main Program --------
if __name__ == "__main__":
    # n = int(input().strip())
    data = "-4 -2 -2 0 2 4"
    nums = list(map(int, data.split()))

    result = three_sum(nums)

    if not result:
        print("[]")
    else:
        for triplet in result:
            print(triplet)
