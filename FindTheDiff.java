class Solution {
    public char findTheDifference(String s, String t) {
        int freq[]=new int[26];
        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
                return (char)(i+'a');
        }
        return 'a';
}
/////////////////////////////////////////////
class Solution {
    public char findTheDifference(String s, String t) {
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            res=res^s.charAt(i);
        }
        
        for(int i=0;i<t.length();i++)
        {
            res=res^t.charAt(i);
        }
        return (char)res;
}
}
}