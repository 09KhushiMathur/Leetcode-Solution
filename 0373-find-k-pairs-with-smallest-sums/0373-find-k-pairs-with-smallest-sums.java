class Solution {
    class Pair {
        int i;
        int j;
        int sum;

        Pair(int i, int j, int sum) {
            this.i = i;
            this.j = j;
            this.sum = sum;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> a.sum - b.sum);
        int n = nums1.length;
       for(int i =0;i<Math.min(k,nums1.length);i++){
         pq.offer(new Pair(i, 0, nums1[i] + nums2[0]));
       }
        List<List<Integer>> res = new ArrayList<>();
        while (!pq.isEmpty() && k-- > 0) {
            Pair p = pq.poll();
            int i = p.i;
            int j = p.j;
            res.add(Arrays.asList(nums1[i],nums2[j]));
            if (j + 1 < nums2.length) {
                pq.offer(new Pair(i, j + 1, nums1[i] + nums2[j + 1]));
            }

        }
        return res;

    }
}