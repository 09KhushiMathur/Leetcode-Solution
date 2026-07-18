class Solution {
    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        Pair[] arr = new Pair[profits.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Pair(capital[i], profits[i]);

        }
        Arrays.sort(arr, (a, b) -> a.first - b.first);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int idx = 0;
        for (int i = 0; i < k; i++) {
            while (idx < n && arr[idx].first <= w) {
                pq.offer(arr[idx].second);
                idx++;
            }
            if (pq.isEmpty()) {
                break;
            }
            int pro = pq.poll();
            w += pro;
        }
        return w;
    }
}