class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                nums[count++] = key;
            }
        }
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=nums[i];
        }
        return arr;
    }
}