class Solution {
    public static boolean solve(String str,int i,int j){
        if(i>=j){
            return true;

        }
        if(str.charAt(i)==str.charAt(j)){
            return solve(str,i+1,j-1);
        }
        return false;
    }
    public String longestPalindrome(String s) {
        int maxlength=Integer.MIN_VALUE;
        int n=s.length();
        int startpoint=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)==true){
                    if(j-i+1>maxlength){
                        maxlength=j-i+1;
                        startpoint=i;
                    }
                }
            }
        }
        return s.substring(startpoint,startpoint+maxlength);
    }
}