/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        int mod=(int)(1e9+7);
	       
	         ArrayList<Integer> a=new ArrayList<>();
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	            a.add(arr[i]);
	        }
	       
	        int q=sc.nextInt();
	        for(int i11=0;i11<q;i11++)
	        {
	            int x=sc.nextInt();
	            ArrayList<Integer> res=new ArrayList<>(a);
	            
	            if(x>0) //right
	            { x=x%n;
	            reverse(a,0,x-1);
	            reverse(a,x,n-1);
	            reverse(a,0,n-1);
	            for(int i:a)
	            res.add(i);
	             long sum=0;
	             for(int i:res)
	             {
	                 sum+=i;
	                 sum=sum%mod;
	             }
	             
	            System.out.println(sum);
	            
	            a=new ArrayList<>(res);
	                
	            }
	            else //
	            {
	                x=Math.abs(x);
	                x=x%n;
	                
	           
	            reverse(a,0,n-1);
	            reverse(a,0,x-1);
	             reverse(a,x,n-1);
	             for(int i:a)
	            res.add(i);
	            
	            long sum=0;
	             for(int i:res)
	             {
	                 sum+=i;
	                 sum=sum%mod;
	             }
	            System.out.println(sum);
	            a=new ArrayList<>(res);
	            
	                
	            
	                
	            }
	        }
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    
	}
	        
	        static void reverse(ArrayList<Integer> a, int start, int end)
    {
        int temp;
        while (start < end) {
            temp = a.get(start);
            int s=a.get(start);
            int p=a.get(end);
            
            
          a.set(start,p);
         
          a.set(end,s);
            start++;
            end--;
        }
    }
	        
	        
	    
	}