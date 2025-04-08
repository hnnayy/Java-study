package latihan_bikin;
import java.util.Scanner;

/*
Algorithm
-Take 2-digit input with Scanner.
-Separate into digits
-Print the digits.
Output
Enter a 2-digit number : 75(input)
Digits are 7 and 5.
 */
public class ReachingDigits1 {
    public static void main(String[] args) {
        //masukkin digit satu persatu
        Scanner digit1 = new Scanner(System.in);
        System.out.print("masukkan digit1: ");
        String digit_1 = digit1.next();

        Scanner digit2 = new Scanner(System.in);
        System.out.print("masukkan digit2: ");
        String digit_2 = digit2.next();

        System.out.println("digit1 + digit2 : " + digit_1 + digit_2);


        //kalo masukin 2 digit
        Scanner digit = new Scanner(System.in);
        System.out.print("masukin 2 digit : ");
        String digitt = digit.nextLine();
        String [] digit_split = digitt.split(""); // harus di spasi krn dibagian splitnya ini pake split spasi
        System.out.println("digit pertama adalah: "+ digit_split[0]);
        System.out.println("digit kedua adalah: " + digit_split[1]);





    }

}
