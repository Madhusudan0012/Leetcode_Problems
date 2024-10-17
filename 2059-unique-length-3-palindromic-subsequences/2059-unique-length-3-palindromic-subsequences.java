class Solution {  
    public int countPalindromicSubsequence(String s) {  
        Set<Character> set = new HashSet<>();  
        for (char c : s.toCharArray()) {  
            set.add(c);  
        }  
        
        int ans = 0;  
        for (Character letter : set) {  
            int i = s.indexOf(letter);  
            int j = s.lastIndexOf(letter);  
            if (i < j) {  
                Set<Character> between = new HashSet<>();  
                for (int k = i + 1; k < j; k++) {  
                    between.add(s.charAt(k));  
                }  
                ans += between.size();  
            }  
        }  
        return ans;  
    }  
}