class Solution {
    ArrayList<String> a;
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length()-1;
       a=new ArrayList<>();
        Permutation(s1,0,n);
        for(String s:a)
        {
            if(s2.contains(s))
                return true;
        }
        return false;
    }
    public void Permutation(String s,int l,int r)
    {
        if(l==r)
        { a.add(s);
         return;
        }
        for(int i=l;i<=r;i++)
        {
           s= swap(i,l,s);
            Permutation(s,l+1,r);
           s= swap(i,l,s);
        }
        
    }
    public String swap(int i,int l,String s)
    {
        char ch[]=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[l];
        ch[l]=temp;
        String ss=new String(ch);
        return ss;
        
        
    }
}
///////////////////////////////////////
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int[26];
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        int freq2[]=new int[26];
        int n1=s2.length();
        int count=0;
        for(int j=0;j<=n1-n;j++)
        { freq2=new int[26];
           for(int i=0;i<n;i++)
           {
               freq2[s2.charAt(i+j)-'a']++;
           }
         if(Arrays.equals(freq,freq2))
             return true;
            
        }
       
        return false;
    }
}
//////////////////////////////////////////////////////////////////
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int[26];
        int n=s1.length();
        if(s1.length()>s2.length())
            return false;
        for(int i=0;i<n;i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,freq2))
            return true;
      int start=0;
        for(int i=n;i<s2.length();i++)
        {
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(start)-'a']--;
            start++;
            if(Arrays.equals(freq,freq2))
                return true;
        }
        return false;
    }
}