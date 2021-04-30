class GfG
{
   
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack<Integer> s=new Stack<>();
        
         
      for(int i=0;i<k;i++)
      {
          s.push(q.poll());
      }
        
        while(!s.isEmpty())
        {
q.add(s.pop());
        }
        int d=q.size();
        for(int i=0;i<d-k;i++)
      {
          q.add(q.poll());
      }
        
        
       
       
      return q;
     
}
}
