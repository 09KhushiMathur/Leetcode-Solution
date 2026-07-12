class Solution {
    public long helper(int[] time, int n, long m) {
        long t = 0;
        for (int i = 0; i < n; i++) {
            t = t + (m / time[i]);
        }
        return t;
    }

    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long min = time[0];
        long res = 0;
        long low = 1;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, time[i]);
        }
       long  high = min * totalTrips;
        while (low <= high) {
            long m = (low + high) / 2;
            long tr = helper(time, n, m);
            if (tr >= totalTrips) {
                res = m;
                high = m - 1;

            } else {
                low = m + 1;
            }
        }
        return res;

    }
}