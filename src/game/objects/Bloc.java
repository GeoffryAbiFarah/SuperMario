package game.objects;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bloc extends Object{
	
	private ImageIcon iconBloc;
	private Image imgBloc;
	
	public Bloc(int x, int y) {
		super(43, 65, x, y);
		iconBloc = new ImageIcon(getClass().getResource("/images/bloc.png"));
		imgBloc = iconBloc.getImage();
	}

	
	//getters and setter
	public Image getImgBloc() {
		return imgBloc;
	}
}
