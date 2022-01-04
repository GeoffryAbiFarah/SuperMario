package game.characters;

import java.awt.Image;

import javax.swing.ImageIcon;

import game.Main;

public class Character {
	
	private int width, length; //size
	private int x, y; //position
	private boolean isWalking;
	private boolean toRight;
	public int counter;
	
	public Character(int width, int length, int x, int y) {
		super();
		this.width = width;
		this.length = length;
		this.x = x;
		this.y = y;
		this.isWalking = false;
		this.toRight = true;
		this.counter = 0;
	}
	
	public Image walk(String name, int frequency) {
		
		String str;
		ImageIcon icon;
		Image img;
		
		if(isWalking == false || Main.scene.getxPos() <= 0) {
			if(toRight == true) str = "/images/"+ name + "StopRight.png";
			else str = "/images/"+ name + "StopLeft.png";
		}
		else {
			counter++;
			if(counter / frequency == 0) {
				if(toRight == true) str = "/images/"+ name + "StopRight.png";
				else str = "/images/"+ name + "StopLeft.png";
			}
			else {
				if(toRight == true) str = "/images/"+ name + "WalkRight"+ ".png";
				else str = "/images/"+ name + "WalkLeft"+ ".png";
			}
			if(counter == 2*frequency) counter = 0;
		}
		
		icon = new ImageIcon(getClass().getResource(str));
		img = icon.getImage();
		
		return img;
	}

	//getters and setters
	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isWalking() {
		return isWalking;
	}

	public void setWalking(boolean isWalking) {
		this.isWalking = isWalking;
	}

	public boolean isToRight() {
		return toRight;
	}

	public void setToRight(boolean toRight) {
		this.toRight = toRight;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	

	
	
	
}
