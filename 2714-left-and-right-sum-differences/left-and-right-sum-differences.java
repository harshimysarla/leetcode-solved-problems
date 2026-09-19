class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0;
        for(int i: nums){
            total+=i;
        }
        int leftsum=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int rightsum=total-leftsum-nums[i];
            ans[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return ans;
        
    }
}