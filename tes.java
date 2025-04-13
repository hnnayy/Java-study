import java.util.Arrays;

public class tes {
    public static void main(String[] args){
    int[] nums1 = {1, 3};
    int[] nums2 = {2};

    // CARA 1
    // int nums11 = nums1.length;
    // int nums22 = nums2.length;

    // int[] nums3 = new int[nums11 + nums22];

    // System.arraycopy(nums1, 0, nums3, 0, nums11);
    // System.arraycopy(nums2, 0, nums3, nums11, nums22);

    // System.out.println("sebeulum diurutin: " + Arrays.toString(nums3));
    // Arrays.sort(nums3);
    // System.out.println("setelah diurutin: " + Arrays.toString(nums3));

    //CARA 2
    int[] nums3 = Arrays.stream(new int[][] {nums1,nums2}).flatMapToInt(Arrays::stream).toArray();
    
    Arrays.sort(nums3);
    System.out.println(Arrays.toString(nums3));

    int index = nums3.length / 2;
    int value;

    if (nums3.length % 2 == 0 ){
        value = (int) ((nums3[index-1] + nums3[index])/2.0);
    }
    else{
        value = nums3[index];
    }

    System.out.println("median: " + value);



    }
}
