class RandomizedSet {
    ArrayList<Integer> a;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        a=new ArrayList<>();
        
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!a.contains(val))
        {
            a.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
         if(a.contains(val))
        {
             int d=a.indexOf(val);
           a.remove(d);
            return true;
        }
        return false;
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r=new Random();
        int index=r.nextInt(a.size());
        return a.get(index);
//         int d=(int)Math.random()*a.size();
//         return a.get(d);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////o(1)/////////////////////////////////////////
class RandomizedSet {
    ArrayList<Integer> a;
    HashMap<Integer,Integer> h;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        a=new ArrayList<>();
        h=new HashMap<>();
        
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!h.containsKey(val))
        {    
        a.add(val);
        h.put(val,a.size()-1);
        return true;
        }
         return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(h.containsKey(val))
        {
            int pos=h.get(val);
            //swap
          
            Collections.swap(a,pos,a.size()-1);
              int d=a.get(pos);
            h.put(d,pos);
            a.remove(a.size()-1);
            h.remove(val);
           
            
            
            return true;
        }
        return false;
        
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        System.out.println(a.size());
        Random r=new Random();
       
        int index=r.nextInt(a.size());
        return a.get(index);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */