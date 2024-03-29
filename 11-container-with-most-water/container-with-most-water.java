class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int water=Math.min(height[i],height[j])*(j-i);
            maxwater=Math.max(water,maxwater);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxwater;
    }
}