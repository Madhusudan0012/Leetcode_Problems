class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length ) return nums;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) +1 );
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1 , n2)-> map.get(n1) - map.get(n2));
        for(int n: map.keySet()){
            heap.add(n);
            if(heap.size()>k) heap.poll();
        }
        int[] top = new int[k];
        for(int i = k-1; i>=0 ; i--){
            top[i]= heap.poll();
        }
        return top;

    

    }
}