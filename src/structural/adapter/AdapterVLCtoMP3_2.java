package structural.adapter;

import structural.businessobjects.MP3Player;
import structural.businessobjects.VLCPlayerImpl;

//is a VLCPLayer and a MP3 Player
public class AdapterVLCtoMP3_2 extends VLCPlayerImpl implements MP3Player {

	//CLASS ADAPTER
	//It has access to VLC Player public states & Behaviours during the Compile time itself.
	
	@Override
	public void playMP3File(String filename) {
		// TODO Auto-generated method stub
		playVLCFile(filename);
	}

}
