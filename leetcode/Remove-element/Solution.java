
public class Solution {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        Solution sol = new Solution();
        int result = sol.removeElement(nums, val);

        System.out.println("new length: " + result); //karna kan ini deteksnya index

        for (int i = 0; i < result; i++){
            System.out.print(nums[i] + " ");
        }

    }
    public int removeElement(int[] nums, int val){
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
