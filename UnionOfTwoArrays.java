class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int i=0;
        int j=0;
        while(i<n && j<m)
        {  int l=a[i];
        int r=b[j];
            if(a[i]==b[j])
            { 
                while(i<n && a[i]==l)
                i++;
                while(j<m && b[j]==r)
                j++;
                count++;
            }
            else if(i<n && l<r)
            {
                while(i<n && a[i]==l)
                i++;
                count++;
            }
            else if(j<m && r<l)
            {
                while(j<m && b[j]==r)
                j++;
                count++;
            }
        }
    
        
        while(i<n)
        {
            int d1=a[i];
            while(i<n && a[i]==d1)
            i++;
            count++;
        }
        
        while(j<m)
        {
            //System.out.println("ndsdsmsd");
            int d1=b[j];
            while(j<m && b[j]==d1)
            j++;
            count++;
        }
        return count;
    }
}