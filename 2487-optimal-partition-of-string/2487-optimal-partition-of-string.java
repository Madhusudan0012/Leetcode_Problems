class Solution {
    public int partitionString(String s) {
        int cnt = 1;
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(hs.contains(ch)){
                hs = new HashSet<>();
                cnt++;
            }
            hs.add(ch);
        }
        return cnt;
        
        
    }
}