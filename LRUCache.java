class LRUCache {
    class Node 
    {
        int key;
        int value;
        Node prev;
        Node next;
    }
     Node head=new Node(); //rear
        Node tail=new Node();//front
    HashMap<Integer,Node>h;
    int capacity;

    public LRUCache(int capacity) {
        h=new HashMap<>(capacity);
        head.next=tail;
        tail.prev=head;
            
       
        this.capacity=capacity;
        
    }
    public void add(Node n)
    {
        Node head_next=head.next;
        head.next=n;
        n.prev=head;
        n.next=head_next;
        head_next.prev=n;
       
        
    }
    public void remove(Node n)
    {
        Node next_node=n.next;
        Node prev_node=n.prev;
        next_node.prev=prev_node;
        prev_node.next=next_node;
    }
    
    public int get(int key) {
        if(!h.containsKey(key))
            return -1;
        Node n=h.get(key);
        remove(n);
        add(n);
        return h.get(key).value;
        
    }
    
    public void put(int key, int value) {
        Node n=h.get(key);
        if(n!=null)
        {
            n.value=value;
            remove(n);
            add(n);
           
        }
        else
        {
            if(h.size()==capacity)
            {
                h.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node nn=new Node();
            nn.key=key;
            nn.value=value;
            h.put(key,nn);
            add(nn);
            
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */