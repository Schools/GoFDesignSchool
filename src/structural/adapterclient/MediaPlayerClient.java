package structural.adapterclient;

import structural.businessobjects.AudioPlayer;
import structural.businessobjects.AudioPlayerImpl;

public class MediaPlayerClient {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = AudioPlayerImpl.createAudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
