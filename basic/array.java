//package basic;

public class array {
    public static void main(String[] args) {
        String[] array_string = new String[3];
        array_string[0] ="nadia";
        array_string[1] ="mutia";
        array_string[2] ="hanin";

//        System.out.println(new String(array_string[0][1][2]));
        System.out.println(array_string[0]);

        //kayanya kalo mau munculin semuanya harus make for dah
        for (int i = 0; i < array_string.length; i++){
            System.out.print(array_string[i]+ " ");
        }

        System.out.println();

        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //array dalam array - matrix 2x2

        int[][]matrix  = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };

        System.out.println(matrix[1][0]);
        n = matrix.length;
        for (int a = 0; a < n; a++){
            int m = matrix[a].length;
            for(int b =0; b < m;b++){
                System.out.print(matrix[a][b] + " "); //ini bikin spasi di tiap elemennya
            }
            System.out.println(); //ini baka bikin garis baru matrixnya
        }

    }
}
