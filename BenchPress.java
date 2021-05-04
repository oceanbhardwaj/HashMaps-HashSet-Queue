/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i1=0;i1<t;i1++)
	{
	    int n=sc.nextInt();
	    int W=sc.nextInt();
	    int rod=sc.nextInt();
	    long arr[]=new long[n];
	    HashMap<Long,Long> h=new HashMap<>();
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        h.put(arr[i],h.getOrDefault(arr[i],(long)0)+(long)1);
	        
	    }
	    boolean isFlag=false;
	    if(rod>=W)
	    {
	        System.out.println("YES");
	        isFlag=true;
	        
	    }
	    else{
	        long diff=W-rod;
	        long sum=0;
	        for(long i:h.keySet())
	        {
	            long d=h.get(i);
	            if(d==1)
	            continue;
	            if(d%2==1)
	            d=d-1;
	             sum=sum+d*i;
	             if(sum>=diff)
	             {
	                 System.out.println("YES");
	                 isFlag=true;
	                 break;
	             }
	            
	        }
	        if(!isFlag)
	        System.out.println("NO");
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	}
	}
}