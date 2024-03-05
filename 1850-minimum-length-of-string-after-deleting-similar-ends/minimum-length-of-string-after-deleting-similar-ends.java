class Solution {
    public int minimumLength(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end && s.charAt(start)==s.charAt(end)){
            char current=s.charAt(start);
            while(start<s.length() && s.charAt(start)==current){
                start++;
            }
            while(start<s.length() && s.charAt(end)==current){
                end--;
            }
        }
        return (end < start) ? 0 : (end-start+1);
    }
}