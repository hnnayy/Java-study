
public class Solution2 {
    public static void main(String[] args) {
        String s = "0p";

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(s);
        if (result == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
