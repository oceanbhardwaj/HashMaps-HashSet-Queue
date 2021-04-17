class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> h=new HashSet<>();
        while(i<n && j<m)
        {
            if(nums1[i]==nums2[j])
            {
                h.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
                j++;
            
        }
        int arr[]=new int[h.size()];
        int d=0;
        for(int k:h)
            arr[d++]=k;
        return arr;
        
    }
}