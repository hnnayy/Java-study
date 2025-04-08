package basic;

public class ForLoop {
    public static void main(String[] args) {
        int counter =1; //start from
        for (; counter <=2;){
            System.out.println("perulangan ke -" + counter);
            counter++;
        }

        System.out.println("batas for yang pertama");

        for (int i = 10; i <=13;){
            System.out.println("ini ke -" + i);
            i++;
        }

        //perulangan dengan post statement
        for (int a = 10; a <=13;a++){
            System.out.println("ini yang ke -" + a);

        }
    }
}
