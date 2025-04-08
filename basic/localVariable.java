package basic;

public class localVariable {
    public static void main(String[] args) {
        //LOCAL VARIABLE- DI DALAM MAIN
        int number;
        int x;
        //decalared a local variable, "number" is a local variable
        number = 13;

        System.out.println("this is local variables: " + number);

        x = 15;
        if (x < 5){
            //kalo result di dalem sini dia loal di dalam if nya
            String result = "x < 5";
            System.out.println(result);
        }
        else {
            System.out.println("x > 15");
        }
        //jadi result ga boleh dipanggil di sini.
        //System.out.println(result); - misal ininya taruh sini ya bakal eror

        for (int i = 0; i<3;i++){
            System.out.println("iterasi ke (kalo i+1): " + i+1);
            System.out.println("iterasi ke (kalo (i+1)): " + (i+1));

            int penambahan = i+1;
            System.out.println("iterasi ke (penambahan): " + penambahan);
        }
    }
}
