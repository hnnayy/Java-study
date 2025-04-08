package basic;

public class PrePost {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("preincrement 'a' : " + (a++));
        System.out.println("preincrement 'a' : " + (a++));

        System.out.println("preincrement 'a' : " + (--a));
        System.out.println("postincrement 'a' : " + (+a));
        System.out.println("preincrement 'b' : " + (b++));
        System.out.println("postincrement 'b' : " + (++b));
    }
}
