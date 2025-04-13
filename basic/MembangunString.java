public class MembangunString {
    public static void main(String[] args){
        int numbers = 123;
        StringBuilder rev = new StringBuilder(String.valueOf(numbers));
        rev.reverse();
        System.out.println(rev);
        System.out.println("Tipe data number: " + ((Object)numbers).getClass().getName());  // Akan menyebabkan error karena int adalah primitive
    }
    
}
