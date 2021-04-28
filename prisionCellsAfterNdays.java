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
////////////////////////////////////////////////
class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        HashSet<String> h=new HashSet<>();
        boolean isCycle=false;
        int cycle=0;
        
        for(int i=1;i<=n;i++)
        {
          int[] temp=nextDay(cells,n);
            String str=Arrays.toString(temp);
            if(!h.contains(str))
            {
                cycle++;
                h.add(str);
            }
            else
            {
                isCycle=true;
                break;
            }
            cells=temp;
        }
            if(isCycle)
            {
                n=n%cycle;
                for(int i=1;i<=n;i++)
                {
                   cells=nextDay(cells,n);
                    
                }
                
            }
            
        
        return cells;
        
        
        
        
        
        
        
    }
    public int[] nextDay(int nums[],int n)
    {
        int arr[]=new int[8];
           for(int i=1;i<8-1;i++)
           {
               if(nums[i-1]==nums[i+1])
                   arr[i]=1;
               else 
                   arr[i]=0;
           }
        return arr;
    }
}