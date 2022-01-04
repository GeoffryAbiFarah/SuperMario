package game.characters;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mario extends Character{

	private ImageIcon iconMario;
	private Image imgMario;
	
	public Mario( int x, int y) {
		super(28, 50, x, y);
		this.iconMario = new ImageIcon(getClass().getResource("/images/marioWalkRight.png"));
		this.imgMario = iconMario.getImage();
	}

	
	//getters and setters
	public Image getImgMario() {
		return imgMario;
	}

	public void setImgMario(Image imgMario) {
		this.imgMario = imgMario;
	}
	
	
}
