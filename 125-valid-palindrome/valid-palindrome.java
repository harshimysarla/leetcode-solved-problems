class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        boolean res=true;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(s.charAt(left)!=s.charAt(right)){
                res=false;
            }
            left++;
            right--;

        }
        return res;
        
    }
}