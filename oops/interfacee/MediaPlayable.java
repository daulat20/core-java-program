package oops.interfacee;

//Media Player System: Create an interface "MediaPlayable with methods "play()", "pause()', 
//and stop()".
//Implement two classes 'AudioPlayer' and 'VideoPlayer" with specific play/pause/stop functionality.
//Write a program to allow the user to choose between audio and video playback, and perform 
//actions dynamically using interface references.

public interface MediaPlayable {

	void play();

	void pause();

	void stop();

}

class AudioPlayer implements MediaPlayable {

	public void play() {
		System.out.println("Audio Play Starting Now");
		System.out.println("===================================");
	}

	public void pause() {
		System.out.println("Audio paused.");
		System.out.println("===================================");

	}

	public void stop() {
		System.out.println("Audio stoped");
		System.out.println("===================================");

	}

}

class VideoPlayer implements MediaPlayable {

	public void play() {
		System.out.println("Video Play Starting Now");
		System.out.println("===================================");

	}

	public void pause() {
		System.out.println("Video Paused");
		System.out.println("===================================");

	}

	public void stop() {
		System.out.println("Video Stop");
		System.out.println("===================================");

	}

}