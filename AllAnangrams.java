class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        String s1=sortS(p);
         List<Integer> a=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++)
        {
            String str=sortS(s.substring(i,i+n));
            if(str.equals(s1))
                a.add(i);
            
        }
        return a;
    }
    public String sortS(String s)
    {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
///////////////////////////////////////////////////////count freq/////////
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
       
        int freq1[]=new int[26];
        for(int i=0;i<n;i++)
        {
            freq1[p.charAt(i)-'a']++;
        }
         List<Integer> a=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++)
        {  
            int freq2[]=new int[26];
          for(int j=i;j<i+n;j++)
          {
              freq2[s.charAt(j)-'a']++;
          }
            if(Arrays.equals(freq1,freq2))
                a.add(i);
            
            
            
        }
        return a;
    }
   
}
///////////////////////////////////////////////////////////////////sliding window///////////
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
       if(p.length()>s.length())
           return new ArrayList<>();
        int freq1[]=new int[26];
        for(int i=0;i<n;i++)
        {
            freq1[p.charAt(i)-'a']++;
        }
         List<Integer> a=new ArrayList<>();
          int freq2[]=new int[26];
        for(int i=0;i<n;i++)
        {
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2))
            a.add(0);
            
        for(int i=n;i<s.length();i++)
        {    freq2[s.charAt(i)-'a']++;
         freq2[s.charAt(i-n)-'a']--;
          
            if(Arrays.equals(freq1,freq2))
                a.add(i-n+1);
            
            
            
        }
        return a;
    }
   
}
//////////////////////////////most optimised/////////////////
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int freq[]=new int[26];
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<p.length();i++)
        {
            freq[p.charAt(i)-'a']++;
            
        }
        int left=0;
        int right=0;
        int count=p.length();
        while(right<s.length())
        {
            if(freq[s.charAt(right++)-'a']-->=1)
                count--;
            if(count==0)
                a.add(left);
            if(right-left==p.length() && freq[s.charAt(left++)-'a']++>=0)
                count++;
        }
        return a;
    }
}