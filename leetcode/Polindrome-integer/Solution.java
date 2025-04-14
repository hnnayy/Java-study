public class Solution {
    public static void main(String[] args){
        int x = -121;
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(x);
        if (result == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    //CARA 1
    // public boolean isPalindrome(int x){
    //     int reverse = 0;
    //     int xcopy = x;

    //     while (x > 0){
    //         reverse =(reverse * 10) + (x % 10);
    //         x /=10; 
    //     }

    //     return reverse == xcopy;

    // }

    //CARA 2 PAKE STRING BUILDER
    public boolean isPalindrome(int x){
        if (x < 0) return false;
        
        String xString = Integer.toString(x);
        StringBuilder sb = new StringBuilder(xString);
        sb.reverse();
        return xString.equals(sb.toString());

    }
   
}
