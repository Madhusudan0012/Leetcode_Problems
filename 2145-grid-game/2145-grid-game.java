class Solution {
    public long gridGame(int[][] grid) {
        
    
        int n=grid[0].length;
        if(n==1) return 0;

         long prefix[] = new long[n];
         long suffix[] = new long[n];

         suffix[n-1]=grid[0][n-1];

         for(int i=n-2; i>=0; i--)
         {
             suffix[i]=suffix[i+1]+grid[0][i];
         }

         prefix[0] = grid[1][0];

         for(int i=1; i<n; i++)
          prefix[i]=prefix[i-1]+grid[1][i];

        int shift=0;
          for(int i=0; i<n; i++)
          {
              if(i==n-1)
              {
                 shift=i;
                 break;
              }

              if(suffix[i+1]<prefix[i])
              {
                  shift=i;
                  break;
              }
          }

          if(shift==0)
          return suffix[shift+1];

          if(shift==n-1) return prefix[shift-1];

          long ans=Math.max(prefix[shift-1], suffix[shift+1]);
          return ans;
    }
}