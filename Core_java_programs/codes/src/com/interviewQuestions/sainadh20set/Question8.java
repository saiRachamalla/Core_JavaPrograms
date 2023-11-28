package com.interviewQuestions.sainadh20set;

class MediaPlayer{
	void play() {
		System.out.println("this method describes the work");
	}
}
class AudioPlayer extends MediaPlayer{
	@Override
	void play() {
		System.out.println("Playing Audio");
	}
}
class VideoPlayer extends MediaPlayer{
	@Override
	void play() {
		System.out.println("Playing Video");
	}
}
class player {
	void permit(MediaPlayer ref) {
		ref.play();
	}
}
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer ap=new AudioPlayer();
		VideoPlayer vp=new VideoPlayer();
		player p=new player();
		System.out.println("AudioPlayer:");
		p.permit(ap);
		System.out.println("VideoPlayer :");
		p.permit(vp);
	}

}