package latihan_bikin;
import java.util.Scanner;
/*
Problem
Write a program that converts a Fahrenheit degree to Celsius
Algorithm
-Take input for Fahrenheit
-Use the mathematics expression to convert
-Print the Celsius
Output
Enter the Fahrenheit: 56(input)
56 Fahrenheit equals 13.333 Celsius

--- °F = °C × (9/5) + 32.---

public class ConvertingTemperature {
    public static void main(String[] args){

        Scanner konversi = new Scanner(System.in);
        System.out.println("1. c ke f");
        System.out.println("2. f ke c");
        System.out.print("masukkan pilihanmu: ");
        int pilihan = konversi.nextInt();

        if (pilihan == 1){
            Scanner input = new Scanner(System.in);
            System.out.print("masukkan niali fahrenheit: ");
            float nilai1 = input.nextFloat();

            float hasil = farenheit(nilai1);
            System.out.println("celcius : " + nilai1 + "c" + " diubah ke celcius menjadi : " + hasil +"f");
        }
        else{
            Scanner input2 = new Scanner(System.in);
            System.out.print("masukkan niali fahrenheit: ");
            float nilai2 = input2.nextFloat();

            float hasil2 = celcius(nilai2);
            System.out.println("celcius : " + nilai2 + "c" + " diubah ke farenheit menjadi : " + hasil2 +"f");
        }



    }

    static float farenheit(float c){
        return c * (9/5) + 32;
    }

    static float celcius(float f){
        return (f - 32) * 5/9;
    }

}
*/

// VERSI GPT

//public class ConvertingTemperature {
//    public static void main(String[] args) {
//        Scanner konversi = new Scanner(System.in);
//
//        System.out.println("1. Celsius ke Fahrenheit");
//        System.out.println("2. Fahrenheit ke Celsius");
//        System.out.print("Masukkan pilihanmu: ");
//        int pilihan = konversi.nextInt();
//
//        System.out.print("Masukkan nilai suhu: ");
//        float suhu = konversi.nextFloat();
//
//        if (pilihan == 1) {
//            System.out.printf("%.2f°C diubah ke Fahrenheit menjadi: %.2f°F%n", suhu, celsiusToFahrenheit(suhu));
//        } else if (pilihan == 2) {
//            System.out.printf("%.2f°F diubah ke Celsius menjadi: %.2f°C%n", suhu, fahrenheitToCelsius(suhu));
//        } else {
//            System.out.println("Pilihan tidak valid.");
//        }
//
//        konversi.close();
//    }
//
//    static float celsiusToFahrenheit(float c) {
//        return c * (9.0f / 5) + 32;
//    }
//
//    static float fahrenheitToCelsius(float f) {
//        return (f - 32) * 5 / 9.0f;
//    }
//}
//
//
//
//package latihan_bikin;

//import java.util.Scanner;

public class ConvertingTemperature {
    public static void main(String[] args) {
        Scanner konversi = new Scanner(System.in);
        String perintah;

        do {
            System.out.println("\n1. Celsius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celsius");
            System.out.print("Masukkan pilihanmu (atau ketik 'sudah' untuk keluar): ");
            perintah = konversi.next();

            if (perintah.equalsIgnoreCase("sudah")) {
                System.out.println("Program selesai.");
                break;
            }

            int pilihan = Integer.parseInt(perintah);

            System.out.print("Masukkan nilai suhu: ");
            float suhu = konversi.nextFloat();

            if (pilihan == 1) {
                System.out.printf("%.2f°C diubah ke Fahrenheit menjadi: %.2f°F%n", suhu, celsiusToFahrenheit(suhu));
            } else if (pilihan == 2) {
                System.out.printf("%.2f°F diubah ke Celsius menjadi: %.2f°C%n", suhu, fahrenheitToCelsius(suhu));
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } while (true);

        konversi.close();
    }

    static float celsiusToFahrenheit(float c) {
        return c * (9.0f / 5) + 32;
    }

    static float fahrenheitToCelsius(float f) {
        return (f - 32) * 5 / 9.0f;
    }
}

