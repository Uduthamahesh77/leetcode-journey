class Solution {
    public int minSteps(String s, String t) {
        int count[]=new int[26];
        int count1[]=new int [26];
        for(char ch: s.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            count1[ch-'a']++;
        }
        int operations=0;
        for(int i=0;i<26;i++){
            operations+=Math.abs(count[i]-count1[i]);
        }
        return operations/2;
    }
}