class Solution {
    public int[] rearrangeArray(int[] nums) {
       List<Integer>list1=new ArrayList<>();
       List<Integer>list2=new ArrayList<>();
       for(int i:nums){
           if(i>0){
               list1.add(i);
           }else{
               list2.add(i);
           }
       }
        int pos=0,neg=0;
        List<Integer> list=new ArrayList<>();
        while(pos<list1.size() && neg<list2.size()){
            list.add(list1.get(pos++));
            list.add(list2.get(neg++));
        }
        if(pos<list1.size()){
            list.add(list1.get(pos));
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}