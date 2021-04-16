class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int a1[]={1,-1,0,0};
        int b1[]={0,0,1,-1};
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(grid[i][j]==1)
               {
                  //i+1 ,j.....i-1,j .......i,j+1.......i,j-1
                 int d=4;
                   for(int k=0;k<4;k++)
                   {
                       int a=i+a1[k];
                       int b=j+b1[k];
                       if(a>=0 && a<n && b>=0 && b<m && grid[a][b]==1 )
                           d--;
                   }
                   count=count+d;
                   
                   
                   
                   
                   
               }
                
                
                
                
            }
        }
        return count;
    }
}