package basic;

public class ReturnStatic {

    static double desimal(double x, double y){
        return (x + y)/2.0;
    }
    public static void main(String[] args){
        System.out.println("hasilnya: " + desimal(5.0, 2.0));
        System.out.println("hasilnya: " + desimal(6.0, 2.0));

    }
}

/*
package basic;

class math {

    double desimal(double x, double y){
        //double hasil = (x + y)/2.0;
        return (x + y)/2.0;
    }
    public static void main(String[] args){
        math obj = new math();
        double hasil = obj.desimal(3,5);

        System.out.println(hasil);
//        System.out.println("hasilnya: " + desimal(5.0, 2.0));
//        System.out.println("hasilnya: " + desimal(6.0, 2.0));

    }
}

/*
public return tu ternyata ga penting, maksudnya kalopun ga ada gakan bikin kodingan jadi eror
tapi yang penting kalo misalnya oop ya harus ada method dan psvm
 */

//kalo misalnyaa ga pakestatic tu objeknya harus didefinisiin ulang jadinya kodingan bisa jadi lebih panjang-- kalo bikin
// tergantung dengan objek baru- baru ga pake static karna objeknya dibikin masing2


//no static























