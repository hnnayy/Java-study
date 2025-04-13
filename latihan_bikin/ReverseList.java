import java.util.Arrays;


public class ReverseList {
    public static void main(String[] args){
        int[] a = new int[5];
        a[0] =1;
        a[1] =2;
        a[2] =3;
        a[3] =4;
        a[4] =5;
        System.out.println("sebelum direverse: " + Arrays.toString(a) + " ");

        System.out.print("setelah direverse: ");
        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i]+ " ");
        }

    }
}
