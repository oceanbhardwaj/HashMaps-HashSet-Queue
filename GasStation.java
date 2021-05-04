class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            int sum=0;
            int j=i;
            while(j%n<n)
            {
              
                sum=sum-cost[j%n]+gas[j%n];
                if(sum<0)
                    break;
                 count++;
                if(count==n)
                    return i;
                j++;
               
                
            }
        }
        return -1;
    }
}