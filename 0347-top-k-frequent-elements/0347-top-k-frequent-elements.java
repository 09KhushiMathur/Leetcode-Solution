class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>(
            (a,b)-> map.get(a)- map.get(b)
        );
        for(Integer key:map.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for(int i = k-1;i>=0;i--){
            ans[i] = pq.poll();
        }
        return ans;
        
    }
}