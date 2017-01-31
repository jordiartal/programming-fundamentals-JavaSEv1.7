package thread_carreraCamellos;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class musica implements Runnable {

	private Clip sonido;
	
	public void run(){
		try {
			sonido = AudioSystem.getClip();
			sonido.open(AudioSystem.getAudioInputStream(getClass().getResource("C:\\Projectes\\DawStucom\\Luna\\thread_camello\\src\\sonido.wav")));
			
		} 
		catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}
}
