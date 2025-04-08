package basic;

public class primitiveVSnonprimitive {
    public static void main(String[] args) {
        // Contoh primitive types - nilainya langsung disimpan di variabel
        int a = 1;
        int b = a; // Nilai 'a' disalin ke 'b', jadi 'b' tidak memengaruhi 'a'
        b = 3;
        System.out.println("Primitive a: " + a); // Output: 1
        System.out.println("Primitive b: " + b); // Output: 3

        // Contoh non-primitive types (reference types)
        // Array adalah tipe non-primitive, yang menyimpan referensi ke alamat memori
        String[] c = {"a", "b", "c"};
        String[] d = c; // 'd' menyimpan referensi yang sama dengan 'c'
        d[0] = "e"; // Perubahan di 'd' juga memengaruhi 'c' karena mereka berbagi referensi
        System.out.println("Non-primitive c[0]: " + c[0]); // Output: e
        System.out.println("Non-primitive d[0]: " + d[0]); // Output: e

        System.out.println("===beda topik pembahasan===");
        System.out.println("elemen array ada: " + c.length);
    }
}
