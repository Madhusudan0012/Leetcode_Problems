import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Frequency map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Max-heap (priority queue) based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );

        // Add all entries to the priority queue
        pq.addAll(freqMap.entrySet());

        // Retrieve the top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
