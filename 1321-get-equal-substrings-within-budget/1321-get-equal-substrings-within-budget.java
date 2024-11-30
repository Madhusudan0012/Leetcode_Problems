class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int currCost  = 0;
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right<n ; right++){
            currCost += Math.abs(s.charAt(right) - t.charAt(right));



            while(currCost > maxCost){
                currCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            maxlen = Math.max(maxlen , right-left+1);


        }
        return maxlen;
        
        
    }
}