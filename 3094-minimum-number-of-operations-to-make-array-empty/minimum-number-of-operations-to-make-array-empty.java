class Solution {
    public int minOperations(int[] nums) {
        int i=0,j=0;
        int ans=0;
        Arrays.sort(nums);
        while(j<nums.length){
            while(j<nums.length && nums[i]==nums[j]){
                j++;
            }
            int fre=j-i;
            if(fre==1){
                return -1;
            }
            if(fre%3==0){
                ans+=fre/3;
            }else{
                ans+=(fre/3)+1;
            }
            i=j;
        }
        return ans;
    }
}