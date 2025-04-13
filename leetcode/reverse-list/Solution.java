
public class Solution {

    //SOLUTION BUAT ANGKA POSITIF DOANG

    public static void main(String[] args) {
        int x = 123;
        Solution sol = new Solution();
        int result = sol.reverse(x);
        System.out.println(result);
    }

    // Method untuk membalik array
    public int reverse(int x) {
        StringBuilder rev = new StringBuilder(String.valueOf(x));
        rev.reverse();
        

        //mengubah hasil kembali menjadi integer
        try{
            return Integer.parseInt(rev.toString());

        }
        catch(NumberFormatException e) {
            return 0;
        }
    }

    public int reverse2(int x){
        int res = 0;
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strX).reverse();
        
        try{
            res = Integer.parseInt(sb.toString());
        }
        catch(NumberFormatException e){
            return 0;
        }
        return isNegative ? -res : res; 
}
}