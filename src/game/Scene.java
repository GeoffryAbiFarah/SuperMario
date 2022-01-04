package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import game.characters.Mario;
import game.objects.Bloc;
import game.objects.RedTube;

public class Scene extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon iconBackground;
	private Image imgBackground;
	private Image imgBackground2;
	
	private int xBackground;
	private int xBackground2;
	private int dx;
	
	private ImageIcon iconCastle;
	private Image imgCastle;
	
	private ImageIcon iconStart;
	private Image imgStart;
	
	private int xPos;
	
	public Mario mario;
	
	public RedTube redTube1;
	public Bloc bloc1;
	
	public Scene() {
		super();
		dx = 0;
		xBackground = -50;
		xBackground2 = 750;
		xPos = -1;
		//getClass().getRessource() is used because when the jar is created, it cannot find src/images/...
		iconBackground = new ImageIcon(getClass().getResource("/images/background.png"));
		imgBackground = iconBackground.getImage();
		imgBackground2 = iconBackground.getImage();
		
		iconCastle = new ImageIcon(getClass().getResource("/images/castle1.png"));
		imgCastle = iconCastle.getImage();
		
		iconStart = new ImageIcon(getClass().getResource("/images/start.png"));
		imgStart = iconStart.getImage();
		
		mario = new Mario(300, 245);
		redTube1 = new RedTube(600, 230);
		bloc1 = new Bloc(400, 180);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());
		
		Thread screenChrono = new Thread(new Chrono());
		screenChrono.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;
		
		//detect collision
		if(mario.contactBefore(redTube1) == true) {
			mario.setWalking(false);
			dx = 0;
		}
		
		moveBg();
		redTube1.movement();
		
		
		g2.drawImage(imgBackground, xBackground, 0, null); //draw the bg
		g2.drawImage(imgBackground2, xBackground2, 0, null);
		g2.drawImage(mario.walk("mario", 25), mario.getX(), mario.getY(), null);
		g2.drawImage(redTube1.getImgRedTube(), redTube1.getX(), redTube1.getY(), null);
		g2.drawImage(bloc1.getImgBloc(), bloc1.getX() -xPos, bloc1.getY(), null);
		g2.drawImage(imgCastle, 10 - xPos, 95, null);
		g2.drawImage(imgStart, 220 - xPos, 234, null);
	}
	
	public void moveBg() {
		
		if(xPos >= 0) {
			xPos += dx;
			xBackground -= dx;
			xBackground2 -= dx;
		}
		
		if(xBackground == -800) xBackground = 800;
		else if(xBackground2 == -800) xBackground2 = 800;
		else if(xBackground == 800) xBackground = -800;
		else if(xBackground2 == 800) xBackground2 = -800;
	}
	
//	Getters and Setters
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getxBackground() {
		return xBackground;
	}

	public void setxBackground(int xBackground) {
		this.xBackground = xBackground;
	}

	public int getxBackground2() {
		return xBackground2;
	}

	public void setxBackground2(int xBackground2) {
		this.xBackground2 = xBackground2;
	}

}
