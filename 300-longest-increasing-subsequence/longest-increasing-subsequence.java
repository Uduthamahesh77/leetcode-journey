class Solution {
    public int lengthOfLIS(int[] nums) {
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int value=0;
                for(int j=i-1;j>=0;j--){
                    if(nums[i]>nums[j]){
                    value=Math.max(value,temp[j]);
                    }
                    
                }
            
            temp[i]=value+1;
            }
        int x=0;
        for(int i=0;i<temp.length;i++){
            x=Math.max(temp[i],x);
        }
        return x;
    }
}