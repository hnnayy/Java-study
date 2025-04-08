package basic;

public class StatementExpression {
    public static void main(String[] args) {
        //expression
        int a = 10;
        System.out.println(a);
        System.out.println(a=100);
        //statement
        System.out.println("Hello World");
        //kumpulan statement-bisa pake block kurung kurawal (block) biar lebih enak diliat
        {
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
        }
    }
}

/*
Ekspresi: Fokus pada menghasilkan nilai (misalnya a=100).
Statement: Fokus pada menjalankan aksi tertentu.
Blok: Mengelompokkan banyak statement menggunakan {}.
*/