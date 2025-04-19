import javax.swing.JOptionPane;

public class GUIInput {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Masukkan Angka:");
        try {
            int number = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, "Anda Memasukkan: " + number);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Bukan Angka, Silakan Masukkan Angka.");
        }
    }
}
