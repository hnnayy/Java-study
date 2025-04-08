package basic;

//ini bakal terjadi konversi secara manual maupun konversi paksa narrow sama apa gitu lupa
public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; //akan terjadi overflow karena byte cuma nyampe 127 gabisa nyampe 1000

        System.out.print(iniShort); //kalo print doang gada enter langsungnya
        System.out.println(iniByte); //kalo println itu dh otomatis enter ato buat line baru
        System.out.println(iniByte2);

        //ada 2 cara penulisan tipe data
        String name;
        name = "hanin";
        System.out.println(name);

        String lastName = "her name is brow";
        System.out.println(lastName);

        //penulisan tipe data itu ga berlaku di penulisan variable
        var hidup = "kehidupan";
        System.out.println(hidup);

//        var haha; // kalo penulisanny akaya gini harusnya bakal eror-Cannot infer type: 'var' on variable without initializer
//        haha = hidup;
//        System.out.println(haha);



    }
}

//semua kodingan harus ada di psvm
//C:\Users\HANIN\IdeaProjects\main\src\belajar_java\KonversiNumber.java
//static time language : hanya bisa emnyyimpan tipe data yang sama beda kek js atau php
// maksudnya yang tadinya int ya var selanjutnya kalo mau diubah pun ya harus int lagi
//final var - variabel yang gabisa lagi diubah isinya
