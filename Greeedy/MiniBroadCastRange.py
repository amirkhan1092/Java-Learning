import bisect

def minimum_broadcast_range(listeners, towers):
    listeners.sort()
    towers.sort()
    result = 0

    for listener in listeners:
        # Find position to insert listener in towers (binary search)
        idx = bisect.bisect_left(towers, listener)

        # Distance to the nearest tower on the right (if exists)
        dist1 = abs(towers[idx] - listener) if idx < len(towers) else float('inf')

        # Distance to the nearest tower on the left (if exists)
        dist2 = abs(listener - towers[idx - 1]) if idx > 0 else float('inf')

        # Nearest distance for this listener
        nearest = min(dist1, dist2)

        # Update maximum among all listeners
        result = max(result, nearest)

    return result


# ---------------------------
# Driver Code
# ---------------------------
if __name__ == "__main__":
    # N = int(input().strip())
    data1, data2  = """
8
50 150 250 350 450 550 650 750
2
100 400



""".strip().split('\n')[1::2]
    listeners = list(map(int, data1.split()))
    # M = int(input().strip())
    towers = list(map(int, data2.split()))

    print(minimum_broadcast_range(listeners, towers))
