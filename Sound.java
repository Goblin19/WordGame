import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	//Sounds
	Clip clip;
	URL soundURL[] = new URL[3];

	public Sound() {
		soundURL[0] = getClass().getResource("Rcs/253886__themusicalnomad__negative_beeps.wav");
		soundURL[1] = getClass().getResource("Rcs/109662__grunz__success.wav");
		soundURL[2] = getClass().getResource("Rcs/GameShowBackground.wav");
		
	}
	
	public void getClip(int i) {
		
		try {
			AudioInputStream Audio = AudioSystem.getAudioInputStream(soundURL[i]);
			clip = AudioSystem.getClip();
			clip.open(Audio);
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void play() {
		clip.start();
	}
	
	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop() {
		clip.stop();
	}
	
	public void soundEffect(int i) {
		getClip(i);
		play();
	}
	
	public void backgroundSound(int i) {
		getClip(i);
		play();
		loop();
	}
}
