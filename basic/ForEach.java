public class ForEach {
    public static void main(String[] args) {
        //akses lebih mudah ga bertele2
        String[] names ={
                "nadia", "mutia", "hanin"
        };
        for(var name:names){
            System.out.println(name + ", ");
        }

        int [] bunchofNumber = {33,7,8,43,5};
        int max= findMax(bunchofNumber);

        //munculin arraynya pake for each
        for(var num:bunchofNumber){
            System.out.print(num + ", ");
        }

        System.out.println();
        System.out.println("nilai max dari array ini adalah : " + max);

    }

    public static int findMax(int[] n){
        int maximum = n[0];

        for(int n1:n){
            if(n1>maximum){
                maximum = n1;
            }
        }
        return maximum;
    }
}
