package basic;

public class Method {
    public static void main(String[] args) {
        HelloWorld();
        HelloWorld();
        HelloWorld();

        SayHellow("brow","hanin");

        sum(1,4);
    }

    static void HelloWorld(){
        System.out.println("Hello World");
    }

    static void SayHellow(String Say, String nama){
        System.out.println("yowww " + Say + " " +nama);
    }

    //void itu mengembalikan value
    static int sum(int a, int b){
        int total = a+b;
        System.out.println(a + " + " + b + " = " + total);
        return total;
    };
}
