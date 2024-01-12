class Solution {
    public int isVowels(char s){
        return "aeiouAEIOU".indexOf(s) != -1 ? 1 : 0;
    }
    public boolean halvesAreAlike(String s) {
        int length=s.length();
        int mid=length/2;
        int count=0,count1=0;
        String sb=s.substring(0,mid);
        String sb1=s.substring(mid,length);
        for(int i=0;i<mid;i++){
           count+=isVowels(sb.charAt(i));
        }
        for(int i=0;i<mid;i++){
            count1+=isVowels(sb1.charAt(i));
        }
        
        if(count==count1){
            return true;
        }
        return false;
    }
}