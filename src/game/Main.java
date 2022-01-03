package game;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		// Create a window
		JFrame window = new JFrame("Super Mario");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(700, 360);
		window.setLocationRelativeTo(null); // center of the screen
		window.setResizable(false);
		window.setAlwaysOnTop(true); //above other windows
		
		// Add Panel to the window
		scene = new Scene();
		window.setContentPane(scene);
		window.setVisible(true);
	}

}
