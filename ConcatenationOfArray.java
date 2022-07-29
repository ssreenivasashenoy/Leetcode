class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[(nums.length)*2];
        int flag=0;
        for(int i=0;i<(nums.length)*2;i++){
            a[i]=nums[flag++];
            if(flag==nums.length){
                flag=0;
            }
        }
        return a;
    }
    
}