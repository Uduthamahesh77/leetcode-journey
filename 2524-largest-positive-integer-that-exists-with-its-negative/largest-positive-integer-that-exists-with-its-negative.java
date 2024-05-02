class Solution {
    public int findMaxK(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==0){
                    max=Math.max(max,Math.abs(nums[i]));
                }
            }
        }
        if(max>0){
            return max;
        }
        return -1;
    }
}