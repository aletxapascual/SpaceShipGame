package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage player,speed;
	public static BufferedImage blueLaser,greenLaser,redLaser;
	
	public static void init() {
		player = Loader.ImageLoader("/ships/player.png");
		speed = Loader.ImageLoader("/effects/fire08.png");
		blueLaser = Loader.ImageLoader("/lasers/laserBlue07.png");
		greenLaser = Loader.ImageLoader("/lasers/laserGreen13.png");
		redLaser = Loader.ImageLoader("/lasers/laserRed07.png");
	}

}
