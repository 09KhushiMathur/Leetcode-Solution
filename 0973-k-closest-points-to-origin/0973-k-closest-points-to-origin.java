class Solution {
    class Pair {
        int[] points;
        int distance;

        Pair(int[] points, int distance) {
            this.points = points;
            this.distance = distance;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> b.distance - a.distance);
        for (int i = 0; i < points.length; i++) {
            int dis = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            Pair p = new Pair(points[i], dis);
            pq.offer(p);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().points;
        }
        return res;

    }
}