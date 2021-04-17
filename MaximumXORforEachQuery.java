class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int arr[]=new int[n];
        int n1=n; //length
        int res=0;
        for(int i=0;i<n1;i++)
        {
            res=res^nums[i]; //xor
        }
        int max=1<<maximumBit;
        
        
        int cnt=0;
        int count=0;
        
        for(int i=0;i<n;i++)
        { int m=0;
            int index=0;
        
            int xor=res;
            for(int k=0;k<max;k++)
            {
                int d=xor^k;
                if(d>m)
                {
                    m=d;
                    index=k;
                }
            }
         count++;
         arr[i]=index;
         res=res^nums[n-count];
       
         
            
            
        }
        return arr;
        
            
    }
}
[0,1,1,3]
2
[2,3,4,7]
3
[0,1,2,2,5,7]
3