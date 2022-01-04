package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon iconBackground;
	private Image imgBackground;
	private Image imgBackground2;
	
	private ImageIcon iconMario;
	private Image imgMario;
	
	private int xBackground;
	private int xBackground2;
	private int dx;
	
	private ImageIcon iconCastle;
	private Image imgCastle;
	
	private ImageIcon iconStart;
	private Image imgStart;
	
	private int xPos;
	
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
		
		iconMario = new ImageIcon(getClass().getResource("/images/marioRightWalk.png"));
		imgMario = iconMario.getImage();
		
		iconCastle = new ImageIcon(getClass().getResource("/images/castle1.png"));
		imgCastle = iconCastle.getImage();
		
		iconStart = new ImageIcon(getClass().getResource("/images/start.png"));
		imgStart = iconStart.getImage();
		
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());
		
		Thread screenChrono = new Thread(new Chrono());
		screenChrono.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;
		
		moveBg();
		
		g2.drawImage(imgBackground, xBackground, 0, null); //draw the bg
		g2.drawImage(imgBackground2, xBackground2, 0, null);
		g2.drawImage(imgMario, 300, 245, null); //draw mario
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
