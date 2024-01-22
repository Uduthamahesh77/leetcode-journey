class Solution {
    public int findDuplicate(int[] nums) {
       boolean visited[]=new boolean[nums.length+1];
       for(int i=0;i<nums.length;i++){
           if(visited[nums[i]]){
               return nums[i];
           }else{
               visited[nums[i]]=true;
           }
       }
       return -1;
    }
}