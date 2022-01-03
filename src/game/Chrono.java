package game;

public class Chrono implements Runnable{

	private final int PAUSE = 3; // wait time at each loop in ms
	
	@Override
	public void run() {
		
		while(true) {
			Main.scene.repaint();
			
			try {
				Thread.sleep(PAUSE);
//				System.out.println("test");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
