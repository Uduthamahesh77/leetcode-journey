class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n=nums.length;
        int ct[]=new int[201];
        for(int i=0;i<n;i++){
            ct[nums[i]]++;
        }
        int maxrow=0;
        for(int i=0;i<=200;i++){
            maxrow=Math.max(maxrow,ct[i]);
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<maxrow;i++){
            ArrayList<Integer>in=new ArrayList<>();
            for(int k=0;k<=200;k++){
                if(ct[k]>0){
                    in.add(k);
                    ct[k]--;
                }
            }
            ans.add(in);

        }
        
        return ans;
    }
}