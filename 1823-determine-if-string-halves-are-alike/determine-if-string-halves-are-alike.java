class Solution {
    public int isVowels(char s){
        return "aeiouAEIOU".indexOf(s) != -1 ? 1 : 0;
    }
    public boolean halvesAreAlike(String s) {
        int length=s.length();
        int mid=length/2;
        int count=0,count1=0;
        for(int i=0;i<mid;i++){
           count+=isVowels(s.charAt(i));
        }
        for(int i=mid;i<s.length();i++){
            count1+=isVowels(s.charAt(i));
        }
        
        if(count==count1){
            return true;
        }
        return false;
    }
}