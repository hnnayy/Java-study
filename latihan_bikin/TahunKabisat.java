package latihan_bikin;
import java.util.Scanner;

/*
Problem
This program first prompts the user to enter a year as an int value and checks if it is a leap year.
Algorithm
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Output
Enter a year: 2024(input)
2024 is a leap year.
///////
Enter a year: 2000(input)
2000 is not a leap year.
 */

public class TahunKabisat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan tahun : ");
        int tahun = scanner.nextInt();

        if(tahun % 4 != 0){
            System.out.println("Bukan Tahun Kabisat");
        }else{
            System.out.println("Merupakan Tahun Kabisat");
        }
    }

}
