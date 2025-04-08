package latihan_bikin;
import java.util.Scanner;
import java.util.ArrayList;

/*
Problem
A string is a palindrome if it reads the same forward and backward. The words “mom,” “dad,” and “noon,” for instance, are all palindromes.
Algorithm
Solution is to check whether the first character in the string is the same as the last character. If so, check whether the second character is the same as the second-to-last character. This process continues until a mismatch is found or all the characters in the string are checked
Output
Enter a word: radar(input)
radar is a palindrome word.
///////
Enter a word: test(input)
test is not a palindrome word.
 */
public class PalindromWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("cek kata palindrom apa bukan");
        System.out.print("masukkan kata : ");
        String kata = scanner.nextLine();

        StringBuilder reversedKata = new StringBuilder();
        for(int i= kata.length() -1; i>=0; i--){
            reversedKata.append(kata.charAt(i));
        }

        String Reversed = reversedKata.toString();
        if(kata.equals(Reversed)){
            System.out.println("merupakan palindrom");
            System.out.println(kata + " == " + Reversed);
        }else{
            System.out.println("bukan merupakan palindrom");
            System.out.println(kata + " != " + Reversed);
        }
        /*

        PENULISAN EQUALS TO YANG SALAH PADA STRING, INI HANYA DIGUNAKAN UNTUK ANGKA
           if(kata == reservedKata){
            System.out.println("merupakan palindrom");
            System.out.println(kata + "==" + reservedKata);
        }else{
            System.out.println("bukan merupakan palindrom");
            System.out.println(kata + "!=" + reservedKata);
        }

         */


    }
}
