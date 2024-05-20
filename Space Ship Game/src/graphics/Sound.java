package graphics;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sound {
	
	private Clip clip;
	private FloatControl volume;
	
	public Sound(Clip clip) {
		this.clip = clip;
		volume = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
	}
	
	//Iniciar sonido
	public void play() {
		//Para que siempre inicie desde el comienzo
		clip.setFramePosition(0);
		
		clip.start();
	}
	
	//Musica de fondo
	public void loop() {
		clip.setFramePosition(0);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop() {
		clip.stop();
	}
	
	public int getFramePosition() {
		return clip.getFramePosition();
	}
	
	public void changeVolume(float d) {
		volume.setValue(d);
	}
	
}