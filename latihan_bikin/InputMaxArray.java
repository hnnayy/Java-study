import java.util.Scanner;

public class InputMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the size of the array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        
        // Create an array to store the numbers
        int[] number = new int[n];
        
        // Get user input for the array elements
        System.out.print("Masukkan elemen-elemen array: ");
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        
        // Initialize max with the first element of the array
        int max = number[0];
        
        // Iterate through the array to find the maximum value
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        
        // Print the maximum value
        System.out.println("Nilai maksimum adalah: " + max);
    }
}
