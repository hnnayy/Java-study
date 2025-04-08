package basic;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

//        // INPUT INT - nextInt()
//        Scanner input = new Scanner(System.in);
//        System.out.print("masukkan angka : ");
//        int i = input.nextInt();
//
//        if (i<3){
//            System.out.println("nilai yang kamu masukkan kurang dari 3, nilai yang kamu masukkan adalah : " +i);
//        }
//        else{
//            System.out.println("nilai yang kamu masukkan lebih dari 3, nilai yang kamu masukkan adalah : " +i);
//
//        }
//        // INPUT STRING - nextLine()
//        Scanner nama = new Scanner(System.in);
//        System.out.print("masukkan nama : ");
//        String name = nama.nextLine();
//        System.out.println("nama anda adalah : "+ name);

        //next, kalo next() doang dia bebas
        Scanner brow = new Scanner(System.in);
        System.out.print("masukkan brow : ");
        String sis = brow.next();
//        System.out.println("brow anda adalah : "+ sis);

        Scanner bro = new Scanner(System.in);
        System.out.print("masukkan bro : ");
        String siss = bro.next();
//        System.out.println("bro anda adalah : "+ siss);

        //int jumlahSis = sis+siss; -- temukan perbedaanya dengan menguncomment ini
        String jumlahSis = sis+siss;

        System.out.print(jumlahSis);
    }
}

    //jadi kalo misalnya next doang dia bentuknya cuma string jadi dia gabisa ditambah