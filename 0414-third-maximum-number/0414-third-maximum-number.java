class Solution {
    public int thirdMax(int[] nums) {
        
        TreeSet<Integer> sortedNums = new TreeSet<Integer>();
        
        
        for (int num : nums) {
            
            if (sortedNums.contains(num)) {
                continue;
            }
            
            // If sorted set has 3 elements.
            if (sortedNums.size() == 3) {
                // And the smallest element is smaller than current element.
                if (sortedNums.first() < num) {
                    // Then remove the smallest element and push the current element.
                    sortedNums.pollFirst();
                    sortedNums.add(num);
                }
                
            } 
            else {
                sortedNums.add(num);
            }
        }
        
        if (sortedNums.size() == 3) {
            return sortedNums.first();
        }
        
        return sortedNums.last();
    }
}