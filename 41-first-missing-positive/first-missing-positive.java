class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count=1,x=0;
        for(int i:nums){
            if(i==count){
                count++;
            }
        }
        return count;
    }
}