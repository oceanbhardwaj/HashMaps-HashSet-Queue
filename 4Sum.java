class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<=n-4;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<=n-3;j++)
            {
                if(j-1!=i && nums[j]==nums[j-1])
                continue;
                int left=j+1;
                int right=n-1;
                while(left<right)
                {
                    if(nums[left]+nums[right]+nums[i]+nums[j]==target)
                    {
                        res.add(Arrays.asList(nums[left],nums[right],nums[i],nums[j]));
                        while(left<right && nums[left]==nums[left+1])
                            left++;
                        while(left<right && nums[right]==nums[right-1])
                            right--;
                        left++;
                        right--;
                    }
                    else if(nums[left]+nums[right]+nums[i]+nums[j]>target)
                    {
                        right--;
                    }
                    else
                        left++;

                }
            }
        }
        return res;
    }
}