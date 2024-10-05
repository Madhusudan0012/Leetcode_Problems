class Solution {
    public int maxScore(String s) {
        int ans = 0;
        for(int i = 1; i<s.length() ; i++){
            int curr = 0;
            for(int j = 0 ; j<i ; j++){
                if(s.charAt(j) == '0') curr++;
            }
            for(int j = i ; j<s.length() ; j++ ){
                if(s.charAt(j) == '1') curr++;
            }
            ans = Math.max(ans , curr);
        
        }
        return ans;
    }
}