package clients;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class music { /* this instead to allow music to run when the application opens */
	void playMusic( String musicLocation)
	{
		try
		{
			File musicPath = new File(musicLocation);
			
			if (musicPath.exists())
			{
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.start();
			}
			else
			{
				System.out.println("unable to find file");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
