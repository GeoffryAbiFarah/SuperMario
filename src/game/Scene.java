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
	
	private ImageIcon iconMario;
	private Image imgMario;
	
	private int xBackground;
	
	public Scene() {
		super();
		this.xBackground = -50;
		//getClass().getRessource() is used because when the jar is created, it cannot find src/images/...
		this.iconBackground = new ImageIcon(getClass().getResource("/images/background.png"));
		this.imgBackground = this.iconBackground.getImage();
		this.iconMario = new ImageIcon(getClass().getResource("/images/marioRightWalk.png"));
		this.imgMario = this.iconMario.getImage();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;
		
		g2.drawImage(imgBackground, xBackground, 0, null); //draw the bg
		g2.drawImage(imgMario, 300, 245, null); //draw mario
	}
}
