/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i1=0;i1<t;i1++)
	    {
	        int l=sc.nextInt();
	        String s=sc.next();
	        int index=-1;
	        boolean isflag=false;
	        int count=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='1')
	            {
	                count++;
	                index=i;
	                int d=index;
	                if(d%2==0)
	                d++;
	                if(count>=(d+1)/2)
	                {
	                    isflag=true;
	                    break;
	                }
	            }
	        }
	         
	        if(index%2==0)
	        index++;
	       if(isflag)
	       System.out.println("YES");
	       else if(count>=(index+1)/2 && index!=-1)
	        System.out.println("YES");
	    
	        else
	        System.out.println("NO");
	    }
		
	}
}