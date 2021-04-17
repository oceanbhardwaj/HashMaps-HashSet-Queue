class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<candyType.length;i++)
        {
            h.put(candyType[i],h.getOrDefault(candyType[i],0)+1);
        }
        
        return Math.min(candyType.length/2,h.size());
        
    }
}