# Function to find the sum of the longest sequence of odd numbers in an array

class SlidingWindow:
    

    def sum_of_longest_odd_sequence(cls, arr):
        max_len = 0
        max_sum = 0
        curr_len = 0
        curr_sum = 0
        found_odd = False  # To check if at least one odd exists

        for num in arr:
            if num % 2 != 0:  # Odd number
                found_odd = True
                curr_len += 1
                curr_sum += num
            else:
                # Check if current odd sequence is better
                if curr_len > max_len or (curr_len == max_len and curr_sum > max_sum):
                    max_len = curr_len
                    max_sum = curr_sum
                # Reset
                curr_len = 0
                curr_sum = 0

        # Final check after loop ends
        if curr_len > max_len or (curr_len == max_len and curr_sum > max_sum):
            max_len = curr_len
            max_sum = curr_sum

        # If no odd number found
        if not found_odd:
            return -1

        return max_sum

    def sum_of_longest_odd_sequence(cls,arr):
        max_len = 0
        curr_len = 0
        curr_sum = 0
        all_sums = []  # Store sums of all sequences

        for num in arr:
            if num % 2 != 0:  # odd
                curr_len += 1
                curr_sum += num
            else:
                if curr_len > 0:
                    all_sums.append((curr_len, curr_sum))
                curr_len = 0
                curr_sum = 0

        # Handle if array ends with odds
        if curr_len > 0:
            all_sums.append((curr_len, curr_sum))

        if not all_sums:
            return 0

        # Find the maximum length
        max_len = max(l for l, _ in all_sums)

        # Sum all sequences having the same max length
        total = sum(s for l, s in all_sums if l == max_len)
        return total


# Example tests based on your portal examples
print(sum_of_longest_odd_sequence([1, 3, 5, 2, 7, 9, 11]))  # 9 + 27 = 36
print(sum_of_longest_odd_sequence([2, 3, 5, 7, 10, 1, 3, 5, 8, 11]))  # 15 + 9 = 24
print(sum_of_longest_odd_sequence([2, 4, 6]))  # 0

