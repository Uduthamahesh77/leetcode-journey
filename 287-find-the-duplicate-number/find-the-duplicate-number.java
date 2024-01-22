class Solution {
    public int findDuplicate(int[] nums) {
        int fre[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]>1){
               return i;
            }
        }
        return -1;
    }
}