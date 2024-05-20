package graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Assets {
	
	//Checar que todos los recursos cargaron
	public static boolean loaded=false;
	
	//Cantidad de recursos que van cargando
	public static float count=0;
	
	//Cantidad total de recursos
	public static float MAX_COUNT=57;
	
	public static BufferedImage player,speed,ufo,doubleGunPlayer;
	public static BufferedImage blueLaser,greenLaser,redLaser;
	
	//shield
	public static BufferedImage[] shieldEffect = new BufferedImage[3];
	
	//meteoritos
	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];
	
	//explosion
	public static BufferedImage[] exp = new BufferedImage[9];
	
	//numeros y vida
	public static BufferedImage[] numbers = new BufferedImage[11];	
	public static BufferedImage life;
	
	//Fonts
	public static Font fontBig;
	public static Font fontMed;
	
	//Sonidos
	public static Clip backgroundMusic, explosion, playerLoose, playerShoot, ufoShoot,powerUp;
	
	//Botones
	public static BufferedImage blueBtn, greyBtn;
	
	//PowerUps
	public static BufferedImage orb, doubleScore, doubleGun, fastFire, shield, star;
	
	public static void init() {
		player = loadImage("/ships/player.png");
		doubleGunPlayer = loadImage("/ships/doubleGunPlayer.png");
		speed = loadImage("/effects/fire08.png");
		blueLaser = loadImage("/lasers/laserBlue07.png");
		greenLaser = loadImage("/lasers/laserGreen13.png");
		redLaser = loadImage("/lasers/laserRed07.png");
		ufo = loadImage("/ships/ufo.png");
		life = loadImage("/others/life.png");
		
		fontBig = loadFont("/fonts/ARCADE_N.ttf", 35);		
		fontMed = loadFont("/fonts/ARCADE_N.ttf", 13);
				
		backgroundMusic = loadSound("/sounds/backgroundMusic.wav");
		explosion = loadSound("/sounds/explosion.wav");
		playerLoose = loadSound("/sounds/playerLoose.wav");
		playerShoot = loadSound("/sounds/playerShoot.wav");
		ufoShoot = loadSound("/sounds/ufoShoot.wav");
		powerUp = loadSound("/sounds/powerUp.wav");
		
		greyBtn = loadImage("/ui/grey_button.png");
		blueBtn = loadImage("/ui/blue_button.png");
		
		orb = loadImage("/powers/orb.png");
		doubleScore = loadImage("/powers/doubleScore.png");
		doubleGun = loadImage("/powers/doubleGun.png");
		fastFire = loadImage("/powers/fastFire.png");
		star = loadImage("/powers/star.png");
		shield = loadImage("/powers/shield.png");
		
		for(int i = 0; i < bigs.length; i++)
			bigs[i] = loadImage("/meteors/big"+(i+1)+".png");
		
		for(int i = 0; i < meds.length; i++)
			meds[i] = loadImage("/meteors/med"+(i+1)+".png");
		
		for(int i = 0; i < smalls.length; i++)
			smalls[i] = loadImage("/meteors/small"+(i+1)+".png");
		
		for(int i = 0; i < tinies.length; i++)
			tinies[i] = loadImage("/meteors/tiny"+(i+1)+".png");
		
		for(int i = 0; i < exp.length; i++)
			exp[i] = loadImage("/explosion/"+i+".png");
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = loadImage("/numbers/"+i+".png");
		
		for(int i = 0; i < 3; i++)
			shieldEffect[i] = loadImage("/effects/shield" + (i + 1) +".png");
		
		loaded = true;
		
	}
	
	public static BufferedImage loadImage(String path) {
		count ++;
		return Loader.ImageLoader(path);
	}
	public static Font loadFont(String path, int size) {
		count ++;
		return Loader.loadFont(path, size);
	}
	public static Clip loadSound(String path) {
		count ++;
		return Loader.loadSound(path);
	}

}
