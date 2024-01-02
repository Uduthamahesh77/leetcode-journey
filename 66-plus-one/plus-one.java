class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        digits[n-1]=digits[n-1]+1;
        int carry=digits[n-1]/10;
        digits[n-1]%=10;
        int i=n-2,carry1=carry;
        while(i>=0 && carry>0){
            digits[i]+=carry;
            carry=digits[i]/10;
            digits[i]%=10;
            i--;
            carry1=carry;
        }
        int arr[]=new int[digits.length+1];
        if(carry1>0){
            arr[0]=1;
            for(int j=1;j<arr.length;j++){
                arr[j]=digits[j-1];
            }  
            return arr;
        }
        
        return digits;
    }
}