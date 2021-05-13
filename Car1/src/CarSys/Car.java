package CarSys;

public class Car {
	private int cost;
	private String carName;
	private Engine engine;
	private int carPower;
	private int carVolume;
	public int getCarVolume() {
		return carVolume;
	}

	public void setCarVolume(int carVolume) {
		this.carVolume = carVolume;
	}

	private MusicSystem ms;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine) {   //engine constructor
		this.engine = engine;
	}

	public Car(MusicSystem ms) {    //musicSystem constructor
		this.ms = ms;
	}

	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}




	public String getCarName() {
		return carName;
	}




	public void setCarName(String carName) {
		this.carName = carName;
	}




	public Engine getEngine() {
		return engine;
	}




	public void setEngine(Engine engine) {
		this.engine = engine;
	}




	public int getCarPower() {
		return carPower;
	}




	public void setCarPower(int carPower) {
		this.carPower = carPower;
	}


//business methods

	public void doStartCar()
	{
		 // ------
		carPower = engine.doStartEngine("petrol") + 100;
		
	}
	
	
	
	public void moveCarForward()
	{
		doStartCar();
		if(carPower>1000) System.out.println(" Car speed is High ");
		if(carPower<1000) System.out.println(" Car speed is low ");
		if(carPower<5000) System.out.println(" This must be a truck ");
		
		
	}
	
	public void playMusic()
	{
		carVolume=ms.volumeLevel();
		System.out.println("Car Volume="+carVolume);
		
	}

	public MusicSystem getMs() {
		return ms;
	}

	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}
// toString
	@Override
	public String toString() {
		return "Car [cost=" + cost + ", carName=" + carName + ", engine=" + engine + ", carPower=" + carPower
				+ ", carVolume=" + carVolume + ", ms=" + ms + "]";
	}
	

}
