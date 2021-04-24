class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums)
        {
            if(h.contains(i))
                return true;
            h.add(i);
        }
        return false;
    }
}
////////////////////////////////////////
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
                return true;
        }
        return false;
    }
}