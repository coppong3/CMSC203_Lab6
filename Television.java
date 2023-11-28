/** 
*The purpose of this class is to model a television
*Chrissie Oppong 11/27/23
*/

public class Television {
	//Task #1
	//private fields
	private String MANUFACTURER; //represents the manufacturer of the tv - will not change
	private int SCREEN_SIZE; //the tv's screen size - will not change
	private boolean powerOn; //if the power for the tv is on or off
	private int channel; //the value of the station the tv is on
	private int volume; //the volume of the tv
	
	//Task #2
	public Television(String brand, int screen) {
		MANUFACTURER = brand;
		SCREEN_SIZE = screen;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	//Task #3
	//accessor methods
	public int getVolume() {
		return volume;
	}
	public int getChannel() {
		return channel;
	}
	public String getManufacturer() {
		return MANUFACTURER;
	}
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	//mutator methods
	public void setChannel(int x) {
		channel = x;
	}
	public void power() {
		powerOn = !powerOn;
	}
	public void increaseVolume() {
		volume++;
	}
	public void decreaseVolume() {
		volume--;
	}
	
}
