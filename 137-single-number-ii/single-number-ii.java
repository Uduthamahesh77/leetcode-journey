class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int x=0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                x= i;
            }
        }
        return x;
    }
}