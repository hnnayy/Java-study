package basic;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 60;
        var absen = 90;

        if (nilai < 70 && absen < 70){ // kalo bagian ini salah dan ditulis tanpa else ya gakan ada yang diexecute tp kenapa ada garisnya yh
            System.out.println("nilai mu ga A");
        }
        else{
            System.out.println("kamu kurang bjir");
        }

        //kalo cuma if else gini namanya tenary operator- cuma ada if dan else, kalo satu kondisio ga terpenuhi langsung ke kondisi yang lain
        var poin = 70;
        String ucapan = poin > 76 ?"selamat kamu lulus":"silakan coba lagi";
        System.out.println(ucapan);
    }
}
