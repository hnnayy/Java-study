package latihan_bikin;
import java.util.Scanner;

public class StrukBelanja {
    public static void main(String[] args){
        int totalHarga = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            //input nama barang
            System.out.print("nama barang: ");
            String namaBarang = scanner.nextLine();

            //input harga barang
            System.out.print("harga barang: ");
            int hargaBarang = scanner.nextInt();
            scanner.nextLine();

            totalHarga  +=hargaBarang;

            System.out.print("apakah ada inputan lain (y/n) : ");
            String jawab = scanner.nextLine();

            if(!jawab.equalsIgnoreCase("y")){
                System.out.println("program sudah selesai");
                break;
            }

        }
        while(true);
        System.out.println("total pembayaran: " + totalHarga);

        //total harga barang = totalHarga
//        float diskon = (float) 0.5 * totalHarga;
//        float pajak = (float) 0.1 * (totalHarga - diskon);
//        float totalBayar = (float) totalHarga - diskon - pajak;
//
//        System.out.println("total pembayaran: " + totalBayar);
        }
    }

