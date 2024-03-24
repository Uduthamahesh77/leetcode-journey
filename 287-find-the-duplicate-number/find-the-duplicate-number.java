class Solution {
    public int findDuplicate(int[] nums) {
        int arr1[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr1[nums[i]]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>=2){
                return i;
            }
        }
        return -1;
    }
}