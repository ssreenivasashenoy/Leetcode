class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int[] arr=new int[accounts.length];
        for(int row=0;row<accounts.length;row++){
            for(int col=0;col<accounts[row].length;col++){
                arr[row]=arr[row]+accounts[row][col];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}