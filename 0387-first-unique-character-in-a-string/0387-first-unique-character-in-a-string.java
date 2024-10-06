class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> cnt = new HashMap<>();
        int n = s.length();
        for(int i = 0  ;i<n ; i++){
            char c = s.charAt(i);
            cnt.put(c , cnt.getOrDefault(c, 0) +1);
        }
        for(int i = 0 ; i<s.length() ; i++){
            if(cnt.get(s.charAt(i)) == 1)
            return i;
        }
        return -1;
    }
}