class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(count<2 && nums[j]==nums[j-1]){
                count++;
                nums[i]=nums[j];
                i++;
            }else if(nums[j-1]!=nums[j]){
                count=1;
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}