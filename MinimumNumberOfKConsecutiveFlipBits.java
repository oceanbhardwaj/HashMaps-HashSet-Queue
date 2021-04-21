class Solution {
    public int minKBitFlips(int[] A, int K) {
        int n=A.length;
        int count=0;
        for(int i=0;i<=n-K;i++)
        {
            if(A[i]==1)
            {
              continue;  
            }
            count++;
            
            for(int j=i;j<i+K;j++)
            {
                A[j]=A[j]^1;
            }
        }
       for(int i=0;i<n;i++)
       {
           if(A[i]==0)
               return -1;
       }
        return count;
    }
}
//////////////////////////////////////////////
class Solution {
    public int minKBitFlips(int[] A, int K) {
        //0--evenflips--0--1--0  one more flip
        //1--odd flip--1--0  one more flip
        Queue<Integer> pq=new LinkedList<>();
        int res=0;
        for(int i=0;i<A.length;i++)
        {
            if((A[i]==0 && pq.size()%2==0) ||(A[i]==1 && pq.size()%2==1))
            {
                res++;
                if((i+K)>A.length)
                    return -1;
                pq.add(i+K-1);
                
                
            }
            if(!pq.isEmpty() && pq.peek()<=i)
                    pq.poll();
        }
        return res;
        
    }
}