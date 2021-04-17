class Solution {
    public int[] singleNumber(int[] nums) {
         HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            
        }
        int a[]=new int[2];
        int d=0;
        for(int i:h.keySet())
        {
            if(h.get(i)==1)
                a[d++]=i;
        }
        return a;
    }
}
////////////////////////////////////////////////////////////
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        int even=0;
        int odd=0;
        
       //last set bit in xor
        int set=0;
        for(int i=31;i>=0;i--)
        {
            if(((xor>>i)&1)==1)
            {set=i;
             break;}
        }
        for(int i=0;i<nums.length;i++)
        {
            if(((nums[i]>>set)&1)==1)
                even=even^nums[i];
            else
                odd=odd^nums[i];
        }
        
        
        int a[]=new int[2];
        
        
        
        
        a[0]=even;
        a[1]=odd;
        return a;
    }
}////////////////////////////////////////////////////////////////////////
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        int even=0;
        int odd=0;
        
       //last set bit in xor
       int set=xor & (-xor);  //only 1 bit is set that is last
           for(int i :nums)
           {
               if((i & set) == 0)
               {
                   even=even^i;
               }
               else
                   odd=odd^i;
           }
        
       
        int a[]=new int[2];
        
        
        
        
        a[0]=even;
        a[1]=odd;
        return a;
    }
}