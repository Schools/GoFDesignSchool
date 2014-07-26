package structural.facade;

import structural.businessobjects.MP3Player;
import structural.businessobjects.MP3PlayerImpl;
import structural.businessobjects.VLCPlayerImpl;
import structural.businessobjects.VLCplayer;

public class MediaPlayerFacade {
	
	private MP3Player mp3Player;
	
	private VLCplayer vlcPlayer; 
	
	public MediaPlayerFacade()
	{
		mp3Player = new MP3PlayerImpl();
		vlcPlayer = new VLCPlayerImpl();
	}

	public void playMP3(String filename)
	{
		mp3Player.playMP3File(filename);
	}
	
	public void playVLC(String filename)
	{
		vlcPlayer.playVLCFile(filename);
	}
	
}
