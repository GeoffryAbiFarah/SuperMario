package game.objects;

import game.Main;

public class Object {
	
	private int width, length;
	private int x, y;
	
	public Object(int width, int length, int x, int y) {
		super();
		this.width = width;
		this.length = length;
		this.x = x;
		this.y = y;
	}
	
	public void movement() {
		if(Main.scene.getxPos() >= 0) {
			x -= Main.scene.getDx();
		}
	}
	
	//getters and setters
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
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
	
}
