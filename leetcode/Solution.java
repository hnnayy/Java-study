import java.util.Map;
import java.util.HashMap;

public class solution {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 13;

        solution sol = new solution(); //jelasin tentang bagian ini
        int[] result = sol.twoSums(nums, target); //jelasin tentang bagian ini

        System.out.println("hasilnya ada di indeks: " + result[0] + " dan " + result[1]);
    }

    public int[] twoSums(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No match found");
    }
}
