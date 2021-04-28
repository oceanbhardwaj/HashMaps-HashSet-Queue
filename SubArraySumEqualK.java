class Solution {
    public int subarraySum(int[] nums, int k) {
        int n= nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==k)
                count++;
            int sum=nums[i];
            for(int j=i+1;j<n;j++)
            {
                
                sum=sum+nums[j];
                if(sum==k)
                    count++;
                
            }
        }
        return count;
    }
}
/////////////////////////////////////////////////////////
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        h.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
        sum=sum+nums[i];
            if(h.containsKey(sum-k))
                count+=h.get(sum-k);
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}