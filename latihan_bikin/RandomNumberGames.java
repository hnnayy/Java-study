package latihan_bikin;
import java.util.Scanner;


/*
The program randomly generates two single-digit integers number1 and number2 and displays a question such as
“What is 7 + 9?” to the student. After the student types the answer, the program displays a message to indicate
whether the answer is true or false
Output
What is 5 + 1? (random)
6(input)
Answer is True.
///////
What is 6+1? (random)
9(input)
Answer is False.
 */
public class RandomNumberGames {
    public static void main(String[] args){

        while(true){
            int x = (int)(Math.random() * 200);
            int y = (int)(Math.random() * 200);


            int hasil = x + y;
            Scanner scanner = new Scanner(System.in);
            System.out.print(x + " + " + y + " = ");
            int jawab = scanner.nextInt();

            if (hasil==jawab){
                System.out.println("selamat jawaban anda benar");
//                break;
            }else

                {
                System.out.println("jawaban anda masih salah coba lagi");

            }

        }


//

    }

}

/*
kayayanya equalsIgnoreCase harus pake string deh
ni pasnya pake while true- jadinya kalo kalo pake while dia bakal ngeloop terus.
bakal berenti kalo misalnya dikasi break
ooooo
okee
tapi while do tu lebih ke tipikal kalo bakal ngalakuin (do) perinathnya selama hasilnya bener(?)

 */