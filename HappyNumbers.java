class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        if(n==1)
            return true;
        while(n!=1 && n>0)
        {
            int d=sum(n);
            if(d==1)
                return true;
            
            if(h.contains(d))
                return false;
            h.add(d);
            n=d;
            
        }
        return false;
        
    }
    public int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            int d1=n%10;
             s=s+d1*d1;
            n=n/10;
        }
        return s;
    }
}