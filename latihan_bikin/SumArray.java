import java.util.Scanner;

/*
Read 10 numbers, store it in an integer array. compute their average, and find out how many numbers are above the average.
Output
Number 1: 24(input)
Number 2: 56(input)
.
.
Number 10: 72(input)

Average: 62.2
15 number are above the average.
 */
public class SumArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        float average = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print(i + ". masukkan angka: ");
            int input = scanner.nextInt();
            total += input;
            average = total/i;
        }

        System.out.println("total angka yang anda masukkan adalah : " + total);
        System.out.println("rata-rata angka yang anda masukkan adalah : " + average);

    }
    //karna udh diketahui banyaknya loop 1 kali maka kita pakenya for


}
