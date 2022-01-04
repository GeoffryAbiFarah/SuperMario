package game.objects;

import java.awt.Image;

import javax.swing.ImageIcon;

public class RedTube extends Object{

	private ImageIcon iconRedTube;
	private Image imgRedTube;
	
	public RedTube(int x, int y) {
		super(43, 65, x, y);
		iconRedTube = new ImageIcon(getClass().getResource("/images/redTube.png"));
		imgRedTube = iconRedTube.getImage();
	}

	
	//getters and setter
	public Image getImgRedTube() {
		return imgRedTube;
	}

}
