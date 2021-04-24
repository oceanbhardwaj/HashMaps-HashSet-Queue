class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //naive approach
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && Math.abs(i-j)<=k)
                    return true;
            }
        }
        return false;
    }
}
/////////////////////////////////////////////////////////////
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                int in=h.get(nums[i]);
                if(Math.abs(in-i)<=k)
                    return true;
            }
            
                
            h.put(nums[i],i);
        }
        return false;
    }
}