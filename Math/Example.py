from collections import deque

def make_array_empty(nums):
    q = deque(nums)
    operations = 0

    while q:
        min_val = min(q)
        while q[0] != min_val:  # rotate until smallest is at front
            q.append(q.popleft())
            operations += 1
        q.popleft()  # remove the smallest
        operations += 1

    return operations


def main():
    # n = int(input())
    data = "2 3 1 4"
    nums = list(map(int, data.split()))
    print(make_array_empty(nums))


if __name__ == "__main__":
    main()
