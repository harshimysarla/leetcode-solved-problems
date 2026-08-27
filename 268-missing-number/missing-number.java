class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int n=nums.length;
        int c=(n*(n+1))/2-sum;
        return c;
    }
}