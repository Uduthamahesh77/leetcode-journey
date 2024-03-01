class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1=0;
        int count0=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count0++;
            }else{
                count1++;
            }
        }
        StringBuilder sc=new StringBuilder("");
        for(int i=0;i<count1-1;i++){
            sc.append('1');
        }
        for(int i=0;i<count0;i++){
            sc.append('0');
        }
        sc.append('1');
        
        return sc.toString();
    }
}