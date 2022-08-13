class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1,a=0;
        while(n!=0){
            a=n%10;
            product*=a;
            sum+=a;
            n=n/10;
        }
        return product-sum;
    }
}