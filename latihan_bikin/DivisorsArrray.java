package latihan_bikin;
import java.util.Scanner;
import java.util.ArrayList;


/*
Problem
Write a function which takes a positive integer and returns all its positive divisors.
Algorithm
Create a ArrayList
While x < number
if number can divisible by x
add ArrayList
Output
Enter a number : 20(input)
divisors(20) = [1, 2, 4, 5, 10, 20]

kayanya maksudnya kamu bikin dulu array yang isinya random angka gitu nah kalo misalnya
inputan yang kamu masukin itu bisa dibagi angka dalam array ya keluain tu aarraynya
kayanya pake length dah

 */
public class DivisorsArrray {
    public static void main(String[] args){
       ArrayList<Integer> numbers = new ArrayList<Integer>();

       for(int i = 1; i <=20; i++){
           numbers.add(i);
       }
       System.out.print(numbers);
       System.out.println();

       Scanner scanner = new Scanner(System.in);
       System.out.print("masukkan angka:  ");
       int input = scanner.nextInt();

      for(int number : numbers){
          if (input % number == 0){
              System.out.print(number + " ");

          }
      }


    }
}

//kalo pake arraylist cuma bisa pake non primitif : String Integer
