class Solution {
    public int characterReplacement(String s, int k) {
        int window_s=0;
        int max_count=0;
        int max_len=0;
        int n=s.length();
        int freq[]=new int[26];
        for(int window_e=0;window_e<n;window_e++)
        {
            int d=s.charAt(window_e)-'A';
            freq[d]++;
            int r=freq[d];
            max_count=Math.max(r,max_count);
            while(window_e-window_s+1-max_count>k)
            {
                freq[s.charAt(window_s)-'A']--;
                window_s++;
                
            }
            max_len=Math.max(max_len,window_e-window_s+1);
        }
        
        return max_len;
    }
}