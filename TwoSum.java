class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                   return arr;
                }
            }
        }
        return arr;
    }
}
///////////////////////////////////////////////////////////
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(target-nums[i]))
            {
                arr[0]=i;
                arr[1]=h.get(target-nums[i]);
                break;
            }
            h.put(nums[i],i);
            
            
            
        }
        return arr;
    }
}