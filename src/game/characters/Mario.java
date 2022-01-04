package game.characters;

import java.awt.Image;

import javax.swing.ImageIcon;

import game.Main;

public class Mario extends Character{

	private ImageIcon iconMario;
	private Image imgMario;
	private boolean isJumping;
	private int jumpCounter;
	
	
	public Mario( int x, int y) {
		super(28, 50, x, y);
		this.iconMario = new ImageIcon(getClass().getResource("/images/marioWalkRight.png"));
		this.imgMario = iconMario.getImage();
		this.isJumping = false; 
		this.jumpCounter = 0;
	}
	
	public Image jump() {
		ImageIcon icon;
		Image img;
		String str;
		
		jumpCounter++;
		//going up
		if(jumpCounter <= 35) {
			if(getY() > Main.scene.getHighCeiling()) setY(getY() - 4);
			else jumpCounter = 36;
			if(isToRight()) str = "/images/marioJumpRight.png";
			else str = "/images/marioJumpLeft.png";
		}
		//going down
		else if(getY() + getLength() < Main.scene.getyGround()) {
			setY(getY() + 1);
			if(isToRight()) str = "/images/marioJumpRight.png";
			else str = "/images/marioJumpLeft.png";
		}
		//end jump
		else {
			if(isToRight()) str = "/images/marioStopRight.png";
			else str = "/images/marioStopLeft.png";
			isJumping = false;
			jumpCounter = 0;
		}
		
		icon = new ImageIcon(getClass().getResource(str));
		img = icon.getImage();
		return img;
	}

	
	//getters and setters
	public Image getImgMario() {
		return imgMario;
	}

	public void setImgMario(Image imgMario) {
		this.imgMario = imgMario;
	}


	public boolean isJumping() {
		return isJumping;
	}


	public void setJumping(boolean isJumping) {
		this.isJumping = isJumping;
	}
	
	
}
