package latihan_bikin;
import java.util.Scanner;

/*
Problem
Write a program that randomly generates an integer between 0 and 100, inclusive. The program prompts the user to enter a number continuously until the number matches the randomly generated number. For each user input, the program tells the user whether the input is too low or too high, so the user can choose the next input intelligently.
Output
I hold a number guess it.
64(input)
go up
80(input)
go down
75(input)
You found number.
 */
public class GuessNumber {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 5);
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("masukkan tebakanmu: ");
            int guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("go up");
            } else if (guess > number) {
                System.out.println("go down");
            } else {
                System.out.println("You found number");
                break;
            }
        } while(true);

    }
}