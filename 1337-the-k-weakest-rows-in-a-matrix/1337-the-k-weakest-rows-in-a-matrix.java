class Solution {
    class Pair {
        int value;
        int row;

        Pair(int value, int row) {
            this.value = value;
            this.row = row;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (b.value == a.value) {
                        return b.row - a.row;
                    } else {
                        return b.value - a.value;
                    }
                });
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }

            }
            pq.offer(new Pair(count, i));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            Pair p = pq.poll();
            res[i] = p.row;
        }
        return res;

    }
}