class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){  
                if(nums[i]>nums[j])
                    x++;
            }
            arr[i]=x;
            x=0;
        }
        return arr;
    }
}