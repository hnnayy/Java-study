package basic;
import java.util.Scanner;

class luas{

    float segitiga(float alas, float tinggi){
        return (float)0.5 * (alas*tinggi);
    }

    public static void main(String[] args){
        luas obj = new luas();
        float hasil = obj.segitiga(10,5);
        System.out.println("luas segitiga tanpa masukan = "+ hasil);
        System.out.println(" ");


        //jika menggunakan inputan
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan alas = ");
        float a = scanner.nextInt();
        System.out.print("masukkan tinggi =  ");
        float t = scanner.nextInt();
        System.out.println("luas segitiga hasil inputan = " + obj.segitiga(a,t));

    }

}
