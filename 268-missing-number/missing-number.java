class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        int m=nums[nums.length-1];
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        for(int i=0;i<=m+1;i++){
            if(!h.contains(i)){
                a=i;break;
            }
        }
        return a;
    }
}