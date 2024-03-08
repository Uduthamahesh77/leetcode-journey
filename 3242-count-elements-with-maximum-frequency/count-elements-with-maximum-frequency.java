class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        int max=Integer.MIN_VALUE;
        for(int i: nums){
             arr[i]++;
            max=Math.max(max,arr[i]);
        }
        int count=0;
        for(int i=0;i<=100;i++){
            if(max==arr[i]){
                count+=max;
            }
        }
        return count;
    }
}