package structural.adapter;

import structural.businessobjects.MP3Player;
import structural.businessobjects.MP3PlayerImpl;
import structural.businessobjects.VLCPlayerImpl;
import structural.businessobjects.VLCplayer;

// is a both VLCPlayer & MP3Player
public class AdapterBothMP3nVLC implements VLCplayer, MP3Player {

	// has a VLCPlayer
	private VLCplayer vlcPlayer;

	// has a MP3Player
	private MP3Player mp3Player;
	
	public AdapterBothMP3nVLC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdapterBothMP3nVLC(VLCplayer vlcPlayer, MP3Player mp3Player) {
		super();
		this.vlcPlayer = vlcPlayer;
		this.mp3Player = mp3Player;
	}

	public AdapterBothMP3nVLC(VLCplayer vlcPlayer) {
		super();
		this.vlcPlayer = vlcPlayer;
	}

	public AdapterBothMP3nVLC(MP3Player mp3Player) {
		super();
		this.mp3Player = mp3Player;
	}

	public VLCplayer getVlcPlayer() {
		return vlcPlayer;
	}

	public void setVlcPlayer(VLCplayer vlcPlayer) {
		this.vlcPlayer = vlcPlayer;
	}

	public MP3Player getMp3Player() {
		return mp3Player;
	}

	public void setMp3Player(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}

	public VLCplayer createVLCPlayer() {
		return new VLCPlayerImpl();
	}
	
	public MP3Player createMP3Player() {
		return new MP3PlayerImpl();
	}
	
	@Override
	public void playMP3File(String filename) {
		// TODO Auto-generated method stub
		//vlcPlayer = createVLCPlayer();
		vlcPlayer.playVLCFile(filename);
	}

	@Override
	public void playVLCFile(String filename) {
		// TODO Auto-generated method stub
		//mp3Player = createMP3Player(); 
		mp3Player.playMP3File(filename);
	}

}
