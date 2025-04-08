//package basic;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] Args){
        HashMap<String, Integer> dataMhs = new HashMap<>();

        //list hashmapnya dulu ini tu buat bikin key dan elemennya
        dataMhs.put("hnn", 110);
        // dataMhs.put(335, "risa"); - gaboleh integer baru string gini, harus sama kaya yang awal didefinisiin
        dataMhs.put("risa", 113);
        dataMhs.put("tttt", 133);

        //display
        System.out.println(dataMhs);

        //ubah isi
        dataMhs.put("risa", 1323);
        System.out.println("nim risa diubah: " + dataMhs);

        //replace elemen
        dataMhs.replace("rsa", 1323);
        System.out.println("nim rsa dreplace (gada perubahan): " + dataMhs ); //karna gada rsa sebelumnya ya ga terjadi apa2

        dataMhs.replace("risa", 132897);
        System.out.println("nim risa direplace (ada perubahan): " + dataMhs);

        //remove
        dataMhs.remove("risa", 132897);
        System.out.println("nim risa diapus: " + dataMhs);

        System.out.println("data mhs mengandung ('risa'): " + dataMhs.get("risa"));
        System.out.println("nim ('hnn'): " + dataMhs.get("hnn"));
        System.out.println("value risa ada ga " + dataMhs.containsValue("risa"));
        System.out.println("nim risa ada ga: " + dataMhs.containsValue(132897));
        System.out.println("key hnn ada ga " + dataMhs.containsKey("hnn")); //key,value krn string dulu ynag dideklarasiin maka string jd key
        System.out.println("nim 110 ada ga: " + dataMhs.containsValue(110));

        System.out.println(dataMhs);




    }
}
