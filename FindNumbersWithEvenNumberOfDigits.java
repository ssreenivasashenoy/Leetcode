class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                ans++;
            }
        }
        return ans;
    }
    public boolean even(int a){
        int n=digits(a);
        return (n%2==0);
    }
    public int digits(int a){
        int count=0;
        while(a>0){
            count++;
            a=a/10;
        }
        return count;
    }
}