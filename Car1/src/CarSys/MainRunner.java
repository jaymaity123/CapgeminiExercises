package CarSys;

public class MainRunner {
public static void main(String[] args) {
		
		Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type B
		
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
		car1.moveCarForward();
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		
		car1.moveCarForward();
		
		Car car2 = new Car(tataEngine);
		
		//--- Switch to new component ---
		// --- change engine ---

		//-----Volume Set---------
		MusicSystem hondaMusic = new MusicSystem();
		hondaMusic.setVolume(10);
		Car car3 = new Car(hondaMusic);
		car3.playMusic();
		
		//--------Car Array
		car1.setCarName("Skoda");
		car1.setCarPower(1000);
		car2.setCarPower(1500);
		car3.setCarPower(2000);
		car3.setCarName("Honda");
		car2.setCarName("Nano");
		Demo app = new Demo();
		app.insertCar(car1);
		app.insertCar(car2);
		app.insertCar(car3);
		
	
		for(Car car: app.cars)
		{
			if(car.getCarPower()>=1500)
				System.out.println(car.toString());
		}
	}
}
