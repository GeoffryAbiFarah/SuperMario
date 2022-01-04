package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			if(Main.scene.getxPos() == -1) {
				Main.scene.setxPos(0);
				Main.scene.setxBackground(-50);
				Main.scene.setxBackground2(750);
			}
			Main.scene.mario.setWalking(true);
			Main.scene.mario.setToRight(true);
			Main.scene.setDx(1);
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Main.scene.setDx(-1);

			Main.scene.mario.setWalking(true);
			Main.scene.mario.setToRight(false);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.setDx(0);

		Main.scene.mario.setWalking(false);
	}
	
}
