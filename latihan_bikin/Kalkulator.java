package latihan_bikin;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner masukan = new Scanner(System.in);

        System.out.print("value 1 : ");
        int value1 = masukan.nextInt();

        System.out.print("operator : ");
        String operasi= masukan.next();

        System.out.print("value 2 : ");
        int value2 = masukan.nextInt();

        int hasil = operator(value1,value2,operasi);
        System.out.println("hasil : "+hasil);

        masukan.close();

    }

    static int operator(int value1, int value2, String operasi){
        switch(operasi){
            case "+" :
                return value1 + value2;
            case "*":
                return value1 * value2;
            case "-":
                return value1 - value2;
            case "/" :
                if (value2 !=0){
                    return value1 / value2;
                }
                else{
                    System.out.println("tidak bisa dibagi dengan nol");
                }
            default:
                System.out.println("kodingannya ada yang salah");
                return 0;
        }
    }
}
