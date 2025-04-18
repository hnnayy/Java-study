public class MaxArray {
    public static void main(String[] args){
        int[] number = {1, 5, 2, 4, 7};
        int max = number[0];

        for(int i = 1; i < number.length; i++){
            if(number[i] > max){
                max = number[i];

            }
        }

        System.out.println("number maxnya adalah: " + max);
    }
}
