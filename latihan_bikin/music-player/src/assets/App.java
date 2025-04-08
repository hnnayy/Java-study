package src.assets;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MusicPlayerGUI player = new MusicPlayerGUI();
                player.setVisible(true); // Agar GUI muncul
            }
        });
    }
}
