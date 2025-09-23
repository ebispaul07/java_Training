package com.abstra;

abstract class Plugin{
	public abstract void initialize();
	public abstract void execute();
	public abstract void terminate();
}

class AudioPlugin extends Plugin{
	public  void initialize() {
		System.out.println("Audio Plugin Initialize");
	}
	public  void execute() {
		System.out.println("Audio Plugin Execute");
	}
	public  void terminate() {
		System.out.println("Audio Plugin Terminate");
	}
}

class VideoPlugin extends Plugin{
	public  void initialize() {
		System.out.println("Video Plugin Initialize");
	}
	public  void execute() {
		System.out.println("Video Plugin Execute");
	}
	public  void terminate() {
		System.out.println("Video Plugin Terminate");
	}
}

class SecurityPlugin extends Plugin{
	public  void initialize() {
		System.out.println("Security Plugin Initialize");
	}
	public  void execute() {
		System.out.println("Security Plugin Execute");
	}
	public  void terminate() {
		System.out.println("Security Plugin Terminate");
	}
}

public class Application {
	public static void main(String[] args) {
		
		Plugin[] plug= {new AudioPlugin(),new VideoPlugin(),new SecurityPlugin()};
		
		for(int i=0;i<plug.length;i++) {
			plug[i].initialize();
			plug[i].execute();
			plug[i].terminate();
		}
		
	}
}
