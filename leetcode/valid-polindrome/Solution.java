class Solution {
    
    public static void main(String[] args){
        String s = "0p";

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(s);
        if(result == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public boolean isPalindrome(String s) {
       String clean = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
       String reverse = new StringBuilder(clean).reverse().toString();
       return clean.equals(reverse); 
    }
}