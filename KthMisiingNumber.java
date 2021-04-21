class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> h=new HashSet<>();
        
        for(int i:arr)
            h.add(i);
        int count=0;
        
        for(int i=1;i<=1000000000;i++)
        {
            if(!h.contains(i))
            {
                count++;
                if(count==k)
                    return i;
            }
        }
       return -1;
        
    }
}
//////////////////////////////////////////////
class Solution {
    public int findKthPositive(int[] arr, int k) {
       int i=0;
        int n=1;
        for(i=0;i<arr.length;n++)
        {
            if(arr[i]==n)
                i++;
            else if(--k==0)
                return n;
        }
        
        return arr[arr.length-1]+k;
        
        
        
        
        
        
        
        
        
    }
}
/////////////////////////binary search///////
class Solution {
    public int findKthPositive(int[] arr, int k) {
     int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            int d=arr[mid]-(mid+1); //diff
            if(d<k)
                l=mid+1;
            else if(k<=d)
                h=mid-1;
            
            
                
            
        }
        if(h==-1)
            return k;
        else
            return arr[h]+(k-(arr[h]-(h+1)));
        
        
        
        
    }
}