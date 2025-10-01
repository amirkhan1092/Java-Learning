package Greeedy;
import java.util.*;

public class  MinimumBroadcastRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of listeners
        int N = sc.nextInt();
        int[] listeners = new int[N];
        for (int i = 0; i < N; i++) {
            listeners[i] = sc.nextInt();
        }

        // Read number of towers
        int M = sc.nextInt();
        int[] towers = new int[M];
        for (int i = 0; i < M; i++) {
            towers[i] = sc.nextInt();
        }

        // Sort both arrays
        Arrays.sort(listeners);
        Arrays.sort(towers);

        int result = 0;

        // For each listener, find nearest tower using binary search
        for (int listener : listeners) {
            int idx = Arrays.binarySearch(towers, listener);

            // If listener is exactly at a tower
            if (idx >= 0) {
                continue;
            } else {
                // insertion point
                idx = -(idx + 1);

                int dist1 = (idx < towers.length) ? Math.abs(towers[idx] - listener) : Integer.MAX_VALUE;
                int dist2 = (idx > 0) ? Math.abs(listener - towers[idx - 1]) : Integer.MAX_VALUE;

                int nearest = Math.min(dist1, dist2);
                result = Math.max(result, nearest);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
