class Solution {
    public int[] findErrorNums(int[] nums) {
        int fre[]=new int[nums.length+1];
        for(int i: nums){
            fre[i]++;
        }
        int duplicate=-1;
        int missing=-1;
        for(int i=1;i<=nums.length;i++){
            if(fre[i]==2){
                duplicate=i;
            }
            if(fre[i]==0){
                missing=i;
            }
        }
        return new int[] {duplicate,missing};
    }
}