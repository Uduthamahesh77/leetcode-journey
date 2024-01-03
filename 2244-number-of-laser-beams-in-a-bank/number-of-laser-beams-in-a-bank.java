class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int prevRow=0;
        int result=0;
        for(int i=0;i<n;i++){
            int currentRow=0;
            for(char ch:bank[i].toCharArray()){
                if(ch=='1'){
                    currentRow++;
                }
            }
                result+=(currentRow*prevRow);
                if(currentRow!=0){
                    prevRow=currentRow;
                }
        }
        return result;
    }
}