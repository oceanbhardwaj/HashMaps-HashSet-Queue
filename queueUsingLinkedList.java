class MyQueue
{
    QueueNode top,prev;
    
   
	void push(int a)
	{
	    
	    if(top==null){
       QueueNode t=new QueueNode(a);
      
       top=t;
	    }
	    else
	    {
	        top.next=new QueueNode(a);
	        top=top.next;
	    }
       if(prev==null)
       prev=top;
       
       

}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(prev==null)
	    {
	       return -1; 
	    }
	    else
	    {
       int d=prev.data;
       prev=prev.next;
       return d;
	    }
	}
}




