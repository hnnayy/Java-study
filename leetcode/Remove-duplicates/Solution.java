
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution sol = new Solution();
        int result = sol.removeDuplicates(nums);
        System.out.println("new length: " + result);
        System.out.print("new output array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}


//1 disitu artinya ia hanya mengizinkan 1 elemen yang sama kalo 
//mau mengizinkan dua elemen yang sama ya tinggal diganti 2
