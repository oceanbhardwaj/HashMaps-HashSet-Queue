class Solution {
    public int findLHS(int[] nums) {
        //find all subsequence
        int d=1<<nums.length;
        int count=0;
        for(int i=0;i<d;i++)
        {
            int c=0;
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<nums.length;j++)
            {
                if(((i>>j)&1)!=0)//set
                {
                    min=Math.min(min,nums[j]);
                    max=Math.max(max,nums[j]);
                    c++;
                   
                    
                }
                
                
            }
            if(max-min==1)
            count=Math.max(c,count);
        }
        return count;
        
    }
}
///////////////////////////////////////////////////////
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int i:h.keySet())
        {
            if(h.containsKey(i+1))
            {
                count=Math.max(h.get(i)+h.get(i+1),count);
            }
        }
        return count;
    }
}