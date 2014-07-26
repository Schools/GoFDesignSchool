package structural.adapter;

import structural.businessobjects.MP3Player;
import structural.businessobjects.VLCPlayerImpl;
import structural.businessobjects.VLCplayer;

// is a MP3 Player
public class AdapterVLCtoMP3_1 implements MP3Player {

	//OBJECT ADAPTER
	//It has access to VLC Player public states & Behaviours during the RUN time itself.
	
	//has a VLCPlayer
	private VLCplayer vlcPlayer;

	// When Parameterized Constructor is writern, 
	// It is mandatory to write Empty Constructor explicitly to create objects without passing Parameters. 
	public AdapterVLCtoMP3_1() {
		super();
	}

	// Constructor Injection.
	public AdapterVLCtoMP3_1(VLCplayer vlcPlayer) {
		super();
		this.vlcPlayer = vlcPlayer;
	}
	
	public VLCplayer getVlcPlayer() {
		return vlcPlayer;
	}

    //Setter Injection
	public void setVlcPlayer(VLCplayer vlcPlayer) {
		this.vlcPlayer = vlcPlayer;
	}

	//Factory Method
	public VLCplayer createVLCPlayer() {
		return new VLCPlayerImpl();
	}

	@Override
	public void playMP3File(String filename) {
		// TODO Auto-generated method stub
		// vlcPlayer = getVlcPlayer();
		//vlcPlayer = createVLCPlayer();
		vlcPlayer.playVLCFile(filename);
	}
	
	public void playVLCFile(String filename) {
		vlcPlayer.playVLCFile(filename);
	}
}
