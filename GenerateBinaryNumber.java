class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n)
    {
        Queue<String> q=new LinkedList<>();
        q.add("1");
        ArrayList<String> a=new ArrayList<>();
        while(n-->0)
        {String d=q.poll();
            a.add(d);
            q.add(d+'0');
            q.add(d+'1');
        }
        return a;
    }
    
}