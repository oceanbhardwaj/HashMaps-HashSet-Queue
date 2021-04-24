class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        
        int n=nums.length;
       Arrays.sort(nums);
        for(int i=0;i<=n-3;i++)
        {
            int a1=nums[i];
            int c=-a1;
            int left=0;
            if(i==0 ||( i<n && nums[i]!=nums[i-1]))
            {
                left=i+1;
                
            }
            else
                continue;
       
            
            int right=n-1;
            while(left<right)
            {
                if(nums[left]+nums[right]==c)
                {
                    
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    
                    while(left<right && nums[right]==nums[right-1])
                        right--;
                    
                    while(left<right && nums[left]==nums[left+1])
                        left++;
                    left++;
                    right--;
                   
                    
                }
                else if(nums[left]+nums[right]>c)
                {
                        right--;
                }
                else
                {
                    
                        left++;
                }
            }
        }
        return res;
    }
}