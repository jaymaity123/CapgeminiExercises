package CarSys;

public class MusicSystem {
	private String speaker;
	private int volume;
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	//business Class
	public int volumeLevel()
	{
		if(volume<50)
			return volume=50;
		else
			return volume=90;
	}
	//constructor
	public MusicSystem() {
		super();
		// TODO Auto-generated constructor stub
	}
}
