class Solution {
    public int[] prisonAfterNDays(int[] nums, int n) {
        int n1=nums.length;
       int arr[]=new int[n1];
        n=n%14;
         if(n==0)
           n=14;
        while(n>0)
        {  arr=new int[n1];
           for(int i=1;i<n1-1;i++)
           {
               if(nums[i-1]==nums[i+1])
                   arr[i]=1;
               else 
                   arr[i]=0;
           }
            arr[n1-1]=0;
            arr[0]=0;
            n--;
           
            System.out.println();
          nums=arr;  
             for(int i=0;i<n1;i++)
            {
                System.out.print(nums[i]+ "  ");
            }
            
        }
       
        
        return nums;
    }
}