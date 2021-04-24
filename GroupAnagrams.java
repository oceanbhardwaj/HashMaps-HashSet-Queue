class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String ss[]=new String[strs.length];
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            ss[i]=sortS(strs[i]);
        }
        for(int i=0;i<ss.length;i++)
        {
            String s1=ss[i];
            if(s1.equals("0"))
                continue;
            ArrayList<String> a=new ArrayList<>();
            a.add(strs[i]);
            
            for(int j=i+1;j<strs.length;j++)
            {
                if(s1.equals(ss[j]))
                {
                    ss[j]="0";
                  a.add(strs[j]);  
                }
            }
            res.add(a);
        }
        return res;
        
        
    }
    public String sortS(String s)
    {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
////////////////////////////////////////////////////
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String ss[]=new String[strs.length];
        List<List<String>> res=new ArrayList<>();
        
          HashMap<String,List<String>> h=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            h.putIfAbsent(sortS(strs[i]),new ArrayList<>());
           h.get(sortS(strs[i])).add(strs[i]);
        }
        for(String s:h.keySet())
        {
            res.add(h.get(s));
        }
        return res;
        
        
    }
    public String sortS(String s)
    {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
//////////////////////////////////////////////////o(nk)//////
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        //try to make #1#0#1#......for ac....
       
        for(String s:strs)
        {    int count[]=new int[26];
            for(char c:s.toCharArray())
            {
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++)
            {
                sb.append("#");
                sb.append(count[i]);
                
            }
            String act=sb.toString();
            h.putIfAbsent(act,new ArrayList<>());
            h.get(act).add(s);
            
        }
        for(String s:h.keySet())
        {
         res.add(h.get(s));
        }
        
        return res;
        
        
        
        
        
    }
}