class Solution {
    public int lastStoneWeight(int[] stones) {
        int res = 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
        for(int i =0;i<stones.length;i++){
            pq.offer(stones[i]);
         }
         while(pq.size()>1){
         int first = pq.poll();
         int second = pq.poll();
            if(first==second){
                continue;
            }else{
                int diff = first-second;
                pq.offer(diff);
            }
         }
         if(pq.isEmpty()){
            return res;
         }
         res = pq.poll();
         return res;

        
    }
}