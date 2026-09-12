class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long mod = 1000000007;
        long curr = 0;
        long bestTwo = 0;
        int tSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            tSum = tSum + arr[i];

        }
        int loopLen = Math.min(k,2)*n;
        for (int i = 0; i < loopLen; i++) {
            curr = Math.max(0, curr + arr[i % n]);
            bestTwo = Math.max(curr, bestTwo);
        }
        if (k > 2 && tSum > 0) {
            bestTwo += (long) (k - 2) * tSum;

        }
        return (int) (bestTwo % mod);
    }
}