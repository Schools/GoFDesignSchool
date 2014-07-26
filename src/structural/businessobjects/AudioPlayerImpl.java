package structural.businessobjects;

import structural.adapter.AdapterBothMP3nVLC;
import structural.adapter.AdapterVLCtoMP3_2;
import structural.adapter.AdapterVLCtoMP3_1;
import structural.facade.MediaPlayerFacade;

public class AudioPlayerImpl implements AudioPlayer{

	
	private AudioPlayerImpl(){
		super();
	}
	
	public static AudioPlayer createAudioPlayer()
	{
		return new AudioPlayerImpl();
	}
	
	@Override
	public void play(String format, String filename) {
		// TODO Auto-generated method stub
		System.out.println("Starting Player... ");
		playWithoutAdapters(format,filename);
		System.out.println("Moving to Adapter VLCtoMP3");
		playWithAdapterVLCtoMP3_1(format, filename);
		System.out.println("Moving to Next Adapter MP3toVLC");
		playWithAdapterVLCtoMP3_2(format, filename);
		System.out.println("Moving to Next Adapter MP3nVLC");
		playWithAdapterBothMP3nVLC(format, filename);
		
	}
	
	private void playWithoutAdapters(String format, String filename)
	{
		
		
		
		if(format.equals("vlc"))
		{
			VLCplayer vlcPlayer = new VLCPlayerImpl();
			vlcPlayer.playVLCFile(filename);
		}
		else if (format.equals("mp3"))
		{
			MP3Player mp3Player = new MP3PlayerImpl();
			mp3Player.playMP3File(filename);
		}
		else
		{
			System.out.println("Format Not Supported :"+format);
		}

		//FOR Facade Pattern
/*		MediaPlayerFacade mediaPlayerFacade = new MediaPlayerFacade();
		if(format.equals("vlc"))
		{
			mediaPlayerFacade.playVLC(filename);
		}
		else if (format.equals("mp3"))
		{
			mediaPlayerFacade.playMP3(filename);
		}
		else
		{
			System.out.println("Format Not Supported :"+format);
		}*/
	}

	private void playWithAdapterVLCtoMP3_2(String format, String filename)
	{
		//Can Survive without MP3 Player Implementation
		AdapterVLCtoMP3_2 adapterMP3toVLC = new AdapterVLCtoMP3_2();
		
		if(format.equals("vlc"))
		{
			adapterMP3toVLC.playVLCFile(filename);
		}
		else if (format.equals("mp3"))
		{
			adapterMP3toVLC.playMP3File(filename);
		}
		else
		{
			System.out.println("Format Not Supported :"+format);
		}
	}
	
	private void playWithAdapterVLCtoMP3_1(String format, String filename)
	{
		VLCplayer vlcPlayer = new VLCPlayerImpl();
		//Can Survive without MP3 Player Implementation
		AdapterVLCtoMP3_1 adapterVLCtoMP3 = new AdapterVLCtoMP3_1();
		adapterVLCtoMP3.setVlcPlayer(vlcPlayer);
		
		if(format.equals("vlc"))
		{
			adapterVLCtoMP3.playVLCFile(filename);
		}
		else if (format.equals("mp3"))
		{
			adapterVLCtoMP3.playMP3File(filename);
		}
		else
		{
			System.out.println("Format Not Supported :"+format);
		}
	}
	
	private void playWithAdapterBothMP3nVLC(String format, String filename)
	{
		AdapterBothMP3nVLC adapterBothMP3nVLC = new AdapterBothMP3nVLC();
		
		VLCplayer vlcPlayer = new VLCPlayerImpl();
		MP3Player mp3Player = new MP3PlayerImpl();
		adapterBothMP3nVLC.setMp3Player(mp3Player);
		adapterBothMP3nVLC.setVlcPlayer(vlcPlayer);
		//PLAYERS ARE PLUGGED IN DURING RUNTIME
		
		//If i am going for Constructor Injection, I will have to create both VLC & MP3 Players before creating Adapter.
		
		if(format.equals("vlc"))
		{
			adapterBothMP3nVLC.playVLCFile(filename);
		}
		else if (format.equals("mp3"))
		{
			adapterBothMP3nVLC.playMP3File(filename);
		}
		else
		{
			System.out.println("Format Not Supported :"+format);
		}
	}
}
