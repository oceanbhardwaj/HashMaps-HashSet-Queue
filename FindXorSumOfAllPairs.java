class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
       int res=0;
        for(int i=0;i<arr1.length;i++)
            res=res^arr1[i];
        int res1=0;
         for(int i=0;i<arr2.length;i++)
            res1=res1^arr2[i];
        return res & res1;
    }
}