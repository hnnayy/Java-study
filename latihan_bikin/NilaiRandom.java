package latihan_bikin;
import java.util.Random;
/*
Class contains 50 students
Exam Contains 100 questions
Each questions contains 4 choices (as ‘A’, ‘B’,’C’ and ‘D’) and empty answer (if not filled)
(all of them have same probability)
Each question equal 1 point and 4 incorrect answer delete 1 point from total grade
Algorithm
Randomly generate an exam result
Ramdomly generate a key
Evaluate the exam and list the results on the screen.
Output
Student 1 : 70 Correct, 28 Incorect, 2 Empty answers=63 points
Student 2 : 71 Correct, 29 Incorect, 0 Empty answers=63,75 points
Student 3 : 62 Correct, 3 Incorect, 35 Empty answers=61,25 points

intinya ada 100 soal, munculin buat 5 student aja
1 benar = 1 poin
4 salah = -1 poin
< 4 salah = 0
ga diisi 0
 */
public class NilaiRandom {
    public static void main(String[] args){

        int nilaiSalah = 0;
        for(int i = 1; i <=5 ; i ++){
            //deklarasi benar, salah, kosong
            int soal = 100;
            Random random = new Random();
            int benar =random.nextInt(soal + 1);
            int sisa = soal - benar;
            int salah = random.nextInt(sisa+1);
            int kosong = soal - benar - salah;

            //perhitunganya
            int nilaiBenar = benar * 1;
            if(salah < 4){
                nilaiSalah = salah* 0;
            }else{
                nilaiSalah = salah * (-1);
            }
            int nilaiKosong = kosong * 0;
            int totalNilai = nilaiBenar + nilaiSalah + nilaiKosong;


            //output
            System.out.println("siswa " + i +": benar: " +benar + " salah: " +salah + " kosong: " +kosong + " nilai kosong: " + totalNilai);

        }

    }

}

//        int benar = soal - (int)(Math.random()) * 100 ;
//        int salah = soal - benar - (int)(Math.random()) * 100;
//        int kosong = soal - benar - salah - (int)(Math.random()) * 100;