class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums)
        {if(h.contains(i))
            h.remove(i);
         else
             h.add(i);
            
        } 
        int ans=0;
       for(int i:h)
           
            ans=i;
        
        return ans;
        
    }
}
/////////////////////////////////////////////////////o(n)////
class Solution {
    public int singleNumber(int[] nums) {
       //2*(unique)-sum=ans
        HashSet<Integer> h=new HashSet<>();
        int n=nums.length;
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            h.add(nums[i]);
            sum1+=nums[i];
            
        }
        int sum=0;
        for(int i:h)
            sum+=i;
        return 2*sum-sum1;
        
}
}
///////////////////////////////////////o(n)o(1)space//////////
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }
        return ans;
    }
}