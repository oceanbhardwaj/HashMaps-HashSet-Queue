class Solution {
    public int longestSubstring(String s, int k) {
        int max=0;
        for(int i=0;i<s.length();i++)
        { int freq[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
               if(isValid(freq,k))
               {
                   max=Math.max(max,j-i+1);
               }
                
                
            }
        }
        return max;
    }
    public boolean isValid(int freq[],int k)
    {
        int countk=0;
        int count=0;
        for(int k1=0;k1<26;k1++)
        {
            if(freq[k1]>0)
                count++;
            if(freq[k1]>=k)
                countk++;
            
            
        }
        return count==countk;
    }
}