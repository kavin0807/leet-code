import java.util.*;

class Solution {
    public int countPaths(int n, int[][] roads) {
        int mod = 1_000_000_007;
        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();

        for (int[] r : roads) {
            adj[r[0]].add(new int[]{r[1], r[2]});
            adj[r[1]].add(new int[]{r[0], r[2]});
        }

        long[] shortesttime = new long[n];
        int[] cnt = new int[n];
        Arrays.fill(shortesttime, Long.MAX_VALUE);

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        shortesttime[0] = 0;
        cnt[0] = 1;
        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] top = pq.poll();
            long time = top[0];
            int node = (int) top[1];

            if (time > shortesttime[node]) continue;

            for (int[] edge : adj[node]) {
                int nbr = edge[0], rtime = edge[1];

                if (time + rtime < shortesttime[nbr]) {
                    shortesttime[nbr] = time + rtime;
                    cnt[nbr] = cnt[node];
                    pq.offer(new long[]{shortesttime[nbr], nbr});
                } else if (time + rtime == shortesttime[nbr]) {
                    cnt[nbr] = (cnt[nbr] + cnt[node]) % mod;
                }
            }
        }

        return cnt[n - 1];
    }
}