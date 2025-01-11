class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int len = 0;
        int l = 0, r = 0, n = s.length();
        int[] freq = new int[128];
        
        while(r < n){
            char ch = s.charAt(r);
            
            while (freq[ch] != 0) {
                freq[s.charAt(l)] = 0; 
                l++; 
            }
            freq[ch] = 1;
            len = Math.max(len, r - l + 1);
            r++;
        }
        return len;
    }
}
