class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                if(grid[row][col]<0){
                    ans++;
                }
            }
        }
        return ans;
    }
}